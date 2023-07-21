package com.EndavaTicketManagement.practica.repository.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;


@Entity
@Table(name = "Event")

public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventId;



    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "eventTypeID")
    private EventType eventType;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "venueID")
    private Venue venue;



    @Column(name = "eventName")
private String eventName;

    @Column(name ="endDate")
    private LocalDateTime endDate;

     @Column(name = "startDate")
     private LocalDateTime startDate;



    @Column(name ="eventDescription")
     private String eventDescription;


    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventsId) {
        this.eventId = eventsId;
    }

    public String getName() {
        return eventName;
    }

    public void setName(String name) {
        this.eventName = eventName;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }
    public EventType getEventTypeId() {
        return eventType;
    }

    public void setEventTypeId(EventType eventType) {
        this.eventType = eventType;
    }

    public Venue getVenueId() {
        return venue;
    }

    public void setVenueId(Venue venue) {
        this.venue = venue;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }
    public Event() {

    }

}

