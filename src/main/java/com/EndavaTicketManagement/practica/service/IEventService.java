package com.EndavaTicketManagement.practica.service;
import com.EndavaTicketManagement.practica.repository.model.Event;
import com.EndavaTicketManagement.practica.repository.model.EventType;
import com.EndavaTicketManagement.practica.repository.model.Venue;
import com.EndavaTicketManagement.practica.service.modelDTO.EventDto;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface IEventService {
    public EventDto findByEventName(String name);
    public List<EventDto> getEvents();
    public List<EventDto> getEventByVenueIdAndEventType(int venueId, String name);
}
