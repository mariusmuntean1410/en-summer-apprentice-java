package com.EndavaTicketManagement.practica.repository.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "Event")

public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventId;



    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "eventTypeID")
    private EventType eventTypeId;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "venueID")
    private Venue venueId;



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

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
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
        return eventTypeId;
    }

    public void setEventTypeId(EventType eventType) {
        this.eventTypeId = eventTypeId;
    }

    public Venue getVenueId() {
        return venueId;
    }

    public void setVenueId(Venue venueId) {
        this.venueId = venueId;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }
    public Event() {

    }

    public List<TicketCategory> getTicketCategories() {
        return ticketCategories;
    }

    public void setTicketCategories(List<TicketCategory> ticketCategories) {
        this.ticketCategories = ticketCategories;
    }

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<TicketCategory> ticketCategories;


}

