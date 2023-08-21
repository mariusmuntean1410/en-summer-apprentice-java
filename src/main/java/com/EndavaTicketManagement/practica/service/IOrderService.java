package com.EndavaTicketManagement.practica.service;

import com.EndavaTicketManagement.practica.service.modelDTO.CreateOrderRequestDto;
import com.EndavaTicketManagement.practica.service.modelDTO.CreateOrderResponseDto;
import com.EndavaTicketManagement.practica.service.modelDTO.OrderDto;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface IOrderService {


        public OrderDto findByNumberOfTickets(int numberOfTickets);
        public List<OrderDto> getOrders();
        CreateOrderResponseDto createOrder(CreateOrderRequestDto requestDto);

        }

