package com.EndavaTicketManagement.practica.service;
import com.EndavaTicketManagement.practica.repository.EventRepository;
import com.EndavaTicketManagement.practica.service.mapper.EventToEventDtoMapper;
import com.EndavaTicketManagement.practica.service.modelDTO.EventDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
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
}

