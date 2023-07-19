package com.EndavaTicketManagement.practica.service;

import com.EndavaTicketManagement.practica.service.modelDTO.EventDto;
import com.EndavaTicketManagement.practica.service.modelDTO.OrderDto;

import java.util.List;

public interface IOrderService {


        public OrderDto getOrder(String orderId);
        public List<OrderDto> getOrders();
}
