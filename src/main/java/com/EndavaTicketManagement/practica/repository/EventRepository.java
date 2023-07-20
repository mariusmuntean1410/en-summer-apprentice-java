package com.EndavaTicketManagement.practica.repository;
import com.EndavaTicketManagement.practica.repository.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    public Event findByEventName(String name);


}