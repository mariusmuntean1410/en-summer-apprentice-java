package com.EndavaTicketManagement.practica.service.modelDTO;

import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.Date;

public class CreateOrderResponseDto {

    private int orderId;

    public CreateOrderResponseDto() {

    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }



    public String getTicketCategoryDescription() {
        return ticketCategoryDescription;
    }

    public void setTicketCategoryDescription(String ticketCategoryDescription) {
        this.ticketCategoryDescription = ticketCategoryDescription;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    private String ticketCategoryDescription;
    private int numberOfTickets;
    private double totalPrice;
    private int eventId;
    private LocalDateTime orderedAt;
}
