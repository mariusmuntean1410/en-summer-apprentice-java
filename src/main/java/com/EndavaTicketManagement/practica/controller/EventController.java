package com.EndavaTicketManagement.practica.controller;
import com.EndavaTicketManagement.practica.service.EventService;
import com.EndavaTicketManagement.practica.service.modelDTO.EventDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
    public List<EventDto> getEvents(){
        return eventsService.getEvents();
    }
}