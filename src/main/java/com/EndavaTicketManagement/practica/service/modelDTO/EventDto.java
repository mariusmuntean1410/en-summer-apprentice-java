package com.EndavaTicketManagement.practica.service.modelDTO;

import com.EndavaTicketManagement.practica.repository.model.EventType;
import com.EndavaTicketManagement.practica.repository.model.Venue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDateTime;
@JsonSerialize
public class EventDto {

    private int eventId;
    private Venue venue;

    private EventType eventType;

    public EventDto() {

    }


    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        eventDescription = eventDescription;
    }

    private String eventName;


    private LocalDateTime startDate;


    private LocalDateTime endDate;


    private String eventDescription;

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }





    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }


    public EventDto(int eventId,Venue venue, EventType eventType, String eventName, LocalDateTime startDate
            , LocalDateTime endDate, String eventDescription) {
        this.eventId = eventId;
        this.venue = venue;
        this.eventType = eventType;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.eventDescription = eventDescription;

    }
}
