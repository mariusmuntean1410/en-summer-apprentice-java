package com.EndavaTicketManagement.practica.service;
import com.EndavaTicketManagement.practica.repository.OrderRepository;
import com.EndavaTicketManagement.practica.service.mapper.OrderToOrderDtoMapper;
import com.EndavaTicketManagement.practica.service.modelDTO.OrderDto;

import java.util.List;
import java.util.stream.Collectors;

public class OrderService implements IOrderService {


    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
        System.out.println(orderRepository);
        System.out.println("Creating Order Service");
    }



    @Override
    public OrderDto getOrder(String orderId) {
        return OrderToOrderDtoMapper.convert(orderRepository.getOrder(orderId));
    }

    @Override
    public List<OrderDto> getOrders() {
        return orderRepository.getOrders().stream().map(OrderToOrderDtoMapper::convert).collect(Collectors.toList());
    }
}