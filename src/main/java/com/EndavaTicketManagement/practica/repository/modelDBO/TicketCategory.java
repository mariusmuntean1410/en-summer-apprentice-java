package com.EndavaTicketManagement.practica.repository.modelDBO;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TicketCategory")
public class TicketCategory implements Serializable {
    @Id
    private int ticketCategoryId;

    @ManyToOne
    @JoinColumn(name = "eventID", referencedColumnName = "ticketCategoryID")
    private EventType eventType;
  @Column(name ="description")
    private String description;

    public int getTicketCategoryId() {
        return ticketCategoryId;
    }

    public void setTicketCategoryId(int ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
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
}
