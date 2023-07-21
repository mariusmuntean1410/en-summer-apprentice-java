package com.EndavaTicketManagement.practica.service;
import com.EndavaTicketManagement.practica.repository.OrderRepository;
import com.EndavaTicketManagement.practica.repository.model.Order;
import com.EndavaTicketManagement.practica.service.mapper.OrderToOrderDtoMapper;
import com.EndavaTicketManagement.practica.service.modelDTO.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class OrderService implements IOrderService {


    private OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
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




}