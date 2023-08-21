package com.EndavaTicketManagement.practica.service.modelDTO;

import com.EndavaTicketManagement.practica.repository.model.Customer;
import com.EndavaTicketManagement.practica.repository.model.Event;
import com.EndavaTicketManagement.practica.repository.model.TicketCategory;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@JsonSerialize
public class OrderDto {

    private int orderId;
    private List<TicketCategoryDto> ticketCategories;
    private int eventId;

    public List<TicketCategoryDto> getTicketCategories() {
        return ticketCategories;
    }

    public void setTicketCategories(List<TicketCategoryDto> ticketCategories) {
        this.ticketCategories = ticketCategories;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    private String customerName;


    private String ticketCategoryDescription;



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


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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


    public OrderDto(int orderId, List<TicketCategoryDto> ticketCategories, int eventId, String customerName, String ticketCategoryDescription, int numberOfTickets, LocalDateTime orderedAt, double totalPrice) {
        this.orderId = orderId;
        this.ticketCategories = ticketCategories;
        this.eventId = eventId;
        this.customerName = customerName;
        this.ticketCategoryDescription = ticketCategoryDescription;
        this.numberOfTickets = numberOfTickets;
        this.orderedAt = orderedAt;
        this.totalPrice = totalPrice;
    }
}
