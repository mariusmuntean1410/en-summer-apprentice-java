package com.EndavaTicketManagement.practica.service.mapper;
import com.EndavaTicketManagement.practica.repository.model.Order;
import com.EndavaTicketManagement.practica.service.modelDTO.OrderDto;

public class OrderToOrderDtoMapper {
    public static OrderDto convert(Order order){
        OrderDto orderDto = new OrderDto();
        orderDto.setOrderId(order.getOrderId());
        orderDto.setOrderedAt(order.getOrderedAt());
        orderDto.setNumberOfTickets(order.getNumberOfTickets());
        orderDto.setTotalPrice(order.getTotalPrice());
        orderDto.setCustomerId(order.getCustomer().getCustomerId());
        orderDto.setTicketCategoryId(order.getTicketCategory().getTicketCategoryId());

        return orderDto;

    }
}
