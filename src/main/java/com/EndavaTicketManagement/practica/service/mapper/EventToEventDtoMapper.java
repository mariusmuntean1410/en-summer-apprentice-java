package com.EndavaTicketManagement.practica.service.mapper;

import com.EndavaTicketManagement.practica.service.modelDTO.EventDto;
import com.EndavaTicketManagement.practica.repository.model.Event;
public class EventToEventDtoMapper {

    public static EventDto convert(Event event) {
        EventDto eventDto = new EventDto();
        eventDto.setEventId(event.getEventId());
        eventDto.setEventDescription(event.getEventDescription());
        eventDto.setEventName(event.getName());
        eventDto.setStartDate(event.getStartDate());
        eventDto.setEndDate(event.getEndDate());
        eventDto.setVenue(event.getVenueId());
        eventDto.setEventType(event.getEventTypeId());
        return eventDto;


    }
}

