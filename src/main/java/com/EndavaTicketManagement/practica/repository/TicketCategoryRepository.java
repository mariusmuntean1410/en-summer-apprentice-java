package com.EndavaTicketManagement.practica.repository;

import com.EndavaTicketManagement.practica.repository.model.Event;
import com.EndavaTicketManagement.practica.repository.model.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Long> {

    List<TicketCategory> findByEventId(Event eventId);

}
