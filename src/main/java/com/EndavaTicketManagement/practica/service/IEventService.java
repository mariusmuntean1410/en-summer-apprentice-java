package com.EndavaTicketManagement.practica.service;

import com.EndavaTicketManagement.practica.repository.model.Event;
import com.EndavaTicketManagement.practica.service.modelDTO.EventDto;

import java.util.List;

public interface IEventService {
    public EventDto getEvent(String eventId);
    public List<EventDto> getEvents();
}
