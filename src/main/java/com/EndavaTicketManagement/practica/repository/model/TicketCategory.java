package com.EndavaTicketManagement.practica.repository.model;


import com.EndavaTicketManagement.practica.service.modelDTO.TicketCategoryDto;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TicketCategory")

public class TicketCategory implements Serializable {
    @Id
    private int ticketCategoryId;

    @ManyToOne
    @JoinColumn(name = "eventID")
    private Event eventId;
     @Column(name ="description")
    private String description;



    public int getTicketCategoryId() {
        return ticketCategoryId;
    }

        public void setTicketCategoryId(int ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    public Event getEvent() {
        return eventId;
    }

    public void setEvent(Event eventId) {
        this.eventId = eventId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Column(name ="price")
    private double price;
    public TicketCategory() {
    }


}

