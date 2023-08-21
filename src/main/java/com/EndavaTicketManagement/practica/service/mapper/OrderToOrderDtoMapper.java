package com.EndavaTicketManagement.practica.service.mapper;
import com.EndavaTicketManagement.practica.repository.model.Order;
import com.EndavaTicketManagement.practica.service.modelDTO.OrderDto;
import com.EndavaTicketManagement.practica.service.modelDTO.TicketCategoryDto;

import java.util.List;
import java.util.stream.Collectors;

public class OrderToOrderDtoMapper {
    public static OrderDto convert(Order order){
        OrderDto orderDto = new OrderDto();
        orderDto.setOrderId(order.getOrderId());
        orderDto.setOrderedAt(order.getOrderedAt());
        orderDto.setNumberOfTickets(order.getNumberOfTickets());
        orderDto.setTotalPrice(order.getTotalPrice());
        orderDto.setCustomerName(order.getCustomer().getName());
        orderDto.setTicketCategoryDescription(order.getTicketCategory().getDescription());
        orderDto.setEventId(order.getTicketCategory().getEvent().getEventId());


        return orderDto;
    }

    }

