package com.EndavaTicketManagement.practica.controller;

import com.EndavaTicketManagement.practica.service.OrderService;
import com.EndavaTicketManagement.practica.service.modelDTO.CreateOrderRequestDto;
import com.EndavaTicketManagement.practica.service.modelDTO.CreateOrderResponseDto;
import com.EndavaTicketManagement.practica.service.modelDTO.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController

    @RequestMapping("/order")

    public class OrderController {
    private OrderService orderService;

    @Autowired
    OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping(value = "/find/{numberOfTickets}", method = RequestMethod.GET)
    public OrderDto findByNumberOfTickets(@PathVariable int numberOfTickets) {
        return orderService.findByNumberOfTickets(numberOfTickets);
    }

    @RequestMapping(value = "/all",
            method = RequestMethod.GET)
    public List<OrderDto> getOrders() {

        return orderService.getOrders();
    }

    @PostMapping(value = "/create", produces = {"application/json"}, consumes = {"application/json"})
    public ResponseEntity<CreateOrderResponseDto> createOrder(@RequestBody CreateOrderRequestDto requestDto) {
        CreateOrderResponseDto createdOrderResponse = orderService.createOrder(requestDto);
        return new ResponseEntity<>(createdOrderResponse, HttpStatus.CREATED);
    }
}


