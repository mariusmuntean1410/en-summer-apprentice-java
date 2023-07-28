package com.EndavaTicketManagement.practica.service.mapper;

import com.EndavaTicketManagement.practica.service.modelDTO.EventDto;
import com.EndavaTicketManagement.practica.repository.model.Event;
import com.EndavaTicketManagement.practica.service.modelDTO.TicketCategoryDto;

import java.util.List;
import java.util.stream.Collectors;

public class EventToEventDtoMapper {

    public static EventDto convert(Event event) {
        EventDto eventDto = new EventDto();
        eventDto.setEventId(event.getEventId());
        eventDto.setEventDescription(event.getEventDescription());
        eventDto.setEventName(event.getEventName());
        eventDto.setStartDate(event.getStartDate());
        eventDto.setEndDate(event.getEndDate());
        eventDto.setVenue(event.getVenueId());
        eventDto.setEventType(event.getEventTypeId());
        List<TicketCategoryDto> ticketCategoryDtos = event.getTicketCategories()
                .stream()
                .map(ticketCategory -> {
                    TicketCategoryDto ticketCategoryDto = new TicketCategoryDto();
                    ticketCategoryDto.setTicketCategoryId(ticketCategory.getTicketCategoryId());
                    ticketCategoryDto.setDescription(ticketCategory.getDescription());
                    ticketCategoryDto.setPrice(ticketCategory.getPrice());
                    return ticketCategoryDto;
                })
                .collect(Collectors.toList());
        eventDto.setTicketCategories(ticketCategoryDtos);


        return eventDto;


    }
}

