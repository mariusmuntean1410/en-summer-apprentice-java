package com.EndavaTicketManagement.practica.service;
import com.EndavaTicketManagement.practica.repository.CustomerRepository;
import com.EndavaTicketManagement.practica.repository.OrderRepository;
import com.EndavaTicketManagement.practica.repository.TicketCategoryRepository;
import com.EndavaTicketManagement.practica.repository.model.Customer;
import com.EndavaTicketManagement.practica.repository.model.Event;
import com.EndavaTicketManagement.practica.repository.model.Order;
import com.EndavaTicketManagement.practica.repository.model.TicketCategory;
import com.EndavaTicketManagement.practica.service.mapper.OrderToOrderDtoMapper;
import com.EndavaTicketManagement.practica.service.mapper.TicketCategorytoTicketCategoryDtoMapper;
import com.EndavaTicketManagement.practica.service.modelDTO.CreateOrderRequestDto;
import com.EndavaTicketManagement.practica.service.modelDTO.CreateOrderResponseDto;
import com.EndavaTicketManagement.practica.service.modelDTO.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class OrderService implements IOrderService {


    private OrderRepository orderRepository;
    private CustomerRepository customerRepository;
    private TicketCategoryRepository ticketCategoryRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository, TicketCategoryRepository ticketCategoryRepository, CustomerRepository customerRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
        this.ticketCategoryRepository = ticketCategoryRepository;
        System.out.println(orderRepository);
        System.out.println("Creating Order Service");
    }


    @Override
    public OrderDto findByNumberOfTickets(int numberOfTickets) {
        return OrderToOrderDtoMapper.convert(orderRepository.findByNumberOfTickets(numberOfTickets));
    }

    @Override
    public List<OrderDto> getOrders() {
        return orderRepository.findAll().stream().map(OrderToOrderDtoMapper::convert).collect(Collectors.toList());
    }

    @Override
    public CreateOrderResponseDto createOrder(CreateOrderRequestDto requestDto) {
        Customer customer = new Customer();
        customer.setCustomerId(6);


        TicketCategory ticketCategory = ticketCategoryRepository.findById((long) requestDto.getTicketCategoryId()).orElse(null);





        Order order = new Order();
        order.setCustomer(customer);
        order.setTicketCategory(ticketCategory);
        order.setNumberOfTickets(requestDto.getNumberOfTickets());
        assert ticketCategory != null;
        double ticketPrice = ticketCategory.getPrice();
        double totalPrice = ticketPrice * requestDto.getNumberOfTickets();
        order.setTotalPrice((float) totalPrice);
        order.setOrderedAt(LocalDateTime.now());

        Order savedOrder = orderRepository.save(order);

        CreateOrderResponseDto responseDto = new CreateOrderResponseDto();
        responseDto.setOrderId(savedOrder.getOrderId());
        responseDto.setOrderedAt(savedOrder.getOrderedAt());
        responseDto.setNumberOfTickets(savedOrder.getNumberOfTickets());
        responseDto.setTotalPrice(savedOrder.getTotalPrice());
        responseDto.setTicketCategoryDescription(savedOrder.getTicketCategory().getDescription());
        responseDto.setEventId(requestDto.getEventId());

        return responseDto;
    }

}