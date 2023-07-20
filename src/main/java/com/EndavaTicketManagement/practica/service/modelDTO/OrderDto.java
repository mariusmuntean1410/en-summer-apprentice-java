package com.EndavaTicketManagement.practica.service.modelDTO;

import com.EndavaTicketManagement.practica.repository.model.Customer;
import com.EndavaTicketManagement.practica.repository.model.TicketCategory;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;
@JsonSerialize
public class OrderDto {

    private int orderId;


    private Customer customer;


    private TicketCategory ticketCategory;



    private int numberOfTickets;


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


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
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

    public OrderDto(int orderId, Customer customer, TicketCategory ticketCategory,
                    int numberOfTickets, LocalDateTime orderedAt, double totalPrice) {
        this.orderId = orderId;
        this.customer = customer;
        this.ticketCategory = ticketCategory;
        this.numberOfTickets = numberOfTickets;
        this.orderedAt = orderedAt;
        this.totalPrice = totalPrice;
    }
}
