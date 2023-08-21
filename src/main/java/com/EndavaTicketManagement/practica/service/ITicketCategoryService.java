package com.EndavaTicketManagement.practica.service;

import com.EndavaTicketManagement.practica.repository.model.Event;
import com.EndavaTicketManagement.practica.service.modelDTO.TicketCategoryDto;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ITicketCategoryService {

    public List<TicketCategoryDto> getAllTicketCategories();
    public List<TicketCategoryDto> getTicketCategoriesByEventId(Event eventId);
}
