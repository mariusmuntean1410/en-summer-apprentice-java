package com.EndavaTicketManagement.practica.service;
import com.EndavaTicketManagement.practica.repository.CustomerRepository;
import com.EndavaTicketManagement.practica.repository.OrderRepository;
import com.EndavaTicketManagement.practica.repository.TicketCategoryRepository;
import com.EndavaTicketManagement.practica.repository.model.Customer;
import com.EndavaTicketManagement.practica.repository.model.Order;
import com.EndavaTicketManagement.practica.repository.model.TicketCategory;
import com.EndavaTicketManagement.practica.service.mapper.OrderToOrderDtoMapper;
import com.EndavaTicketManagement.practica.service.mapper.TicketCategorytoTicketCategoryDtoMapper;
import com.EndavaTicketManagement.practica.service.modelDTO.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class OrderService implements IOrderService {


    private OrderRepository orderRepository;
    private CustomerRepository customerRepository;
    private TicketCategoryRepository ticketCategoryRepository;
    private TicketCategorytoTicketCategoryDtoMapper ticketCategorytoTicketCategoryDtoMapper;
    @Autowired
    public OrderService(OrderRepository orderRepository ,TicketCategoryRepository ticketCategoryRepository,CustomerRepository customerRepository) {
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
    public OrderDto createOrder(OrderDto orderDto) {
        Customer customer = customerRepository.findById(2L).orElse(null);


        if (customer == null) {

            throw new RuntimeException("Customer not found");
        }


        TicketCategory ticketCategory = ticketCategoryRepository.findById((long) orderDto.getTicketCategoryId()).orElse(null);


        if (ticketCategory == null) {

            throw new RuntimeException("TicketCategory not found");
        }


        Order order = new Order();
        order.setCustomer(customer);
        order.setTicketCategory(ticketCategory);
        order.setNumberOfTickets(orderDto.getNumberOfTickets());
        double ticketPrice = ticketCategory.getPrice();
        double totalPrice = ticketPrice * orderDto.getNumberOfTickets();
        order.setTotalPrice((float) totalPrice);

        Order savedOrder = orderRepository.save(order);


        return OrderToOrderDtoMapper.convert(savedOrder);


    }
}