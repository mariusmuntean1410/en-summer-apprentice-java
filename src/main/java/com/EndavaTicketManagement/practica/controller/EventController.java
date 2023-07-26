package com.EndavaTicketManagement.practica.controller;
import com.EndavaTicketManagement.practica.repository.model.Event;
import com.EndavaTicketManagement.practica.repository.model.EventType;
import com.EndavaTicketManagement.practica.repository.model.Venue;
import com.EndavaTicketManagement.practica.service.EventService;
import com.EndavaTicketManagement.practica.service.modelDTO.EventDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/event")
public class EventController {
    private EventService eventsService;


    @Autowired
   public EventController(EventService eventsService) {
        this.eventsService = eventsService;
        System.out.println("Creating Events Controller");
    }

    @RequestMapping(value = "/find/{eventName}", method = RequestMethod.GET)
    public EventDto findByEventName(@PathVariable String eventName){
        return eventsService.findByEventName(eventName);
    }

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<EventDto> getEvents() {
        return eventsService.getEvents();

    }
    @GetMapping(value= "/specific" ,produces = {"application/json"},
            consumes = {"application/json"})
    public List<EventDto> findByVenueIdAndEventType(@RequestParam int venueId, @RequestParam String eventType){
        System.out.println("Request event/" + venueId + ' ' + eventType);
        return eventsService.getEventByVenueIdAndEventType(venueId, eventType);
    }



}