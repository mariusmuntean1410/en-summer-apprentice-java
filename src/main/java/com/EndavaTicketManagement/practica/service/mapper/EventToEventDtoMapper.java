package com.EndavaTicketManagement.practica.service.mapper;

import com.EndavaTicketManagement.practica.service.modelDTO.EventDto;
import com.EndavaTicketManagement.practica.repository.model.Event;
public class EventToEventDtoMapper {

    public static EventDto convert(Event event){
        return new EventDto(event.getEventId());

    }
}

