package com.EndavaTicketManagement.practica.repository.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "Orders")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @JsonManagedReference
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "customerID")
    private Customer customer;
    @JsonManagedReference
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "ticketCategoryID")
    private TicketCategory ticketCategory;
  @Column(name = "orderedAt")
  private LocalDateTime orderedAt;

  @Column(name = "numberOfTickets")
  private int numberOfTickets;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomerId() {
        return customer;
    }

    public void setCustomerId(Customer customer) {
        this.customer = customer;
    }

    public TicketCategory getTicketCategoryId() {
        return ticketCategory;
    }

    public void setTicketCategoryId(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Column(name = "totalPrice")
  private float totalPrice;


    public Order() {
    }
}
