package com.EndavaTicketManagement.practica.service.modelDTO;

public class CreateOrderRequestDto {
    private int eventId;
    private int ticketCategoryId;

    public int getEventId() {
        return eventId;
    }

    public CreateOrderRequestDto() {

    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
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

    private int numberOfTickets;
}
