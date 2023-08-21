package com.EndavaTicketManagement.practica.service.modelDTO;

public class TicketCategoryDto {
    private int ticketCategoryId;
    private String description;
    private double price;
    private int eventId;

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
    public TicketCategoryDto() {
    }

    public int getTicketCategoryId() {
        return ticketCategoryId;
    }

    public void setTicketCategoryId(int ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
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
}