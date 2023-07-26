package com.EndavaTicketManagement.practica.repository;
import com.EndavaTicketManagement.practica.repository.model.Event;


import com.EndavaTicketManagement.practica.repository.model.EventType;
import com.EndavaTicketManagement.practica.repository.model.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    public Event findByEventName(String name);


    List<Event> findAllByVenue_VenueIdAndEventType_Name(@Param("venueId") int venueId, @Param("name") String name);
}