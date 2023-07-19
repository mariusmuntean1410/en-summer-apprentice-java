package com.EndavaTicketManagement.practica.repository.modelDBO;


import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "Event")
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventId;



    @ManyToOne
    @JoinColumn(name = "eventTypeID", referencedColumnName = "eventTypeID")
    private EventType eventType;
    @ManyToOne
    @JoinColumn(name = "venueID", referencedColumnName = "venueID")
    private Venue venue;



    @Column(name = "name")
private String name;

    @Column(name ="endDate")
    private LocalDateTime endDate;

     @Column(name = "startDate")
     private LocalDateTime startDate;



    @Column(name ="eventDescription")
     private String eventDescription;

    /*public Event(int eventsId) {
        this.eventsId = eventsId;
        System.out.println("Creating Event");
    }*/
    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventsId) {
        this.eventId = eventsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
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

