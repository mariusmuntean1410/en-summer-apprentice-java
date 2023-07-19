package com.EndavaTicketManagement.practica.repository.model;

public class Event {
    private int eventsId;

    public Event(int eventsId) {
        this.eventsId = eventsId;
        System.out.println("Creating Event");
    }

    public int getEventId() {
        return eventsId;
    }
}

