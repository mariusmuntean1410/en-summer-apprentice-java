package com.EndavaTicketManagement.practica.repository;
import com.EndavaTicketManagement.practica.repository.modelDBO.Event;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class EventRepository {
    private  List<Event> events;

    public EventRepository() {
        System.out.println("Creating EventsRepository");
        events = new ArrayList<>();

    }

    public List<Event> getEvents(){
        return events;
    }

    public Event getEvent(String id){
        Optional<Event> event = events.stream().filter(a-> id.equals(a.getEventId())).findFirst();
        if(event.isPresent()){
            return event.get();
        }
        return null;
    }
}