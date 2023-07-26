package com.EndavaTicketManagement.practica.service;
import com.EndavaTicketManagement.practica.repository.EventRepository;
import com.EndavaTicketManagement.practica.repository.model.Event;
import com.EndavaTicketManagement.practica.repository.model.EventType;
import com.EndavaTicketManagement.practica.repository.model.Venue;
import com.EndavaTicketManagement.practica.service.mapper.EventToEventDtoMapper;
import com.EndavaTicketManagement.practica.service.modelDTO.EventDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


@Service
public class EventService implements IEventService {


    private EventRepository eventRepository;
@Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
        System.out.println(eventRepository);
        System.out.println("Creating Event Service");
    }



    @Override
    public EventDto findByEventName(String eventName) {
        return EventToEventDtoMapper.convert(eventRepository.findByEventName(eventName));
    }

    @Override
    public List<EventDto> getEvents() {
        return eventRepository.findAll().stream().map(EventToEventDtoMapper::convert).collect(Collectors.toList());
    }

    @Override
    public List<EventDto> getEventByVenueIdAndEventType(int venueId, String name) {
        return eventRepository.findAllByVenue_VenueIdAndEventType_Name(venueId, name).stream().map(EventToEventDtoMapper::convert).collect(Collectors.toList());
    }


    }









