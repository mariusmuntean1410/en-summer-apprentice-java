package com.EndavaTicketManagement.practica.controller;
import com.EndavaTicketManagement.practica.repository.model.Event;
import com.EndavaTicketManagement.practica.service.EventService;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@RestController
public class EventController {
    private EventService eventsService;

    /*
    AccountService will get injected here after it is created
     */
  /*  public EventController(EventService eventsService) {
        this.eventsService = eventsService;
        System.out.println("Creating Events Controller");
    }

    @GetMapping("/api/event/{resourceId}")
    public String getEvent(@PathVariable String resourceId){
        return eventsService.getEvent(resourceId);
    }

    @GetMapping("/api/events")
    public List<Event> getEvents(){
        return eventsService.getEvents();
    }*/
}