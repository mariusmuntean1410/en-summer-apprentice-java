package com.EndavaTicketManagement.practica.repository.model;

import jakarta.persistence.*;

import java.io.Serializable;


@Entity
@Table(name = "EventType")

public class EventType implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eventTypeId;


    @Column(name ="name",unique = true)
private String EventTypeName;

    public int getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(int eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public String getEventTypeName() {
        return EventTypeName;
    }

    public void setName(String EventTypeName) {
        this.EventTypeName = EventTypeName;
    }


    public EventType() {

    }

}
