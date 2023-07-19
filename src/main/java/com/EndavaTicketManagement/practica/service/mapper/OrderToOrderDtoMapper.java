package com.EndavaTicketManagement.practica.service.mapper;

import com.EndavaTicketManagement.practica.repository.modelDBO.Event;
import com.EndavaTicketManagement.practica.repository.modelDBO.Order;
import com.EndavaTicketManagement.practica.service.modelDTO.EventDto;
import com.EndavaTicketManagement.practica.service.modelDTO.OrderDto;

public class OrderToOrderDtoMapper {
    public static OrderDto convert(Order order){
        return new OrderDto(order.getOrderId());

    }
}
