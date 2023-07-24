package com.EndavaTicketManagement.practica.service.modelDTO;

import com.EndavaTicketManagement.practica.repository.model.Customer;
import com.EndavaTicketManagement.practica.repository.model.TicketCategory;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;
@JsonSerialize
public class OrderDto {

    private int orderId;


    private int customerId;


    private int ticketCategoryId;



    private int numberOfTickets;

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    private int eventId;

    private LocalDateTime orderedAt;

    private double totalPrice;

    public OrderDto() {

    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getTicketCategoryId() {
        return ticketCategoryId;
    }

    public void setTicketCategoryId(int ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public OrderDto(int orderId, Customer customerId, TicketCategory ticketCategoryId,
                    int numberOfTickets, LocalDateTime orderedAt, double totalPrice) {
        this.orderId = orderId;
        this.numberOfTickets = numberOfTickets;
        this.orderedAt = orderedAt;
        this.totalPrice = totalPrice;
    }



}
