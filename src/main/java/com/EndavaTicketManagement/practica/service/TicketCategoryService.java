package com.EndavaTicketManagement.practica.service;


import com.EndavaTicketManagement.practica.repository.TicketCategoryRepository;

import com.EndavaTicketManagement.practica.repository.model.Event;
import com.EndavaTicketManagement.practica.service.mapper.TicketCategorytoTicketCategoryDtoMapper;
import com.EndavaTicketManagement.practica.service.modelDTO.TicketCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TicketCategoryService implements ITicketCategoryService{

    private final TicketCategoryRepository ticketCategoryRepository;

    @Autowired
    public TicketCategoryService(TicketCategoryRepository ticketCategoryRepository) {
        this.ticketCategoryRepository = ticketCategoryRepository;

    }

    public List<TicketCategoryDto> getAllTicketCategories() {
        return ticketCategoryRepository.findAll().stream().map(TicketCategorytoTicketCategoryDtoMapper::convert).collect(Collectors.toList());
    }
    public List<TicketCategoryDto> getTicketCategoriesByEventId(Event eventId) {
        return ticketCategoryRepository.findByEventId(eventId)
                .stream()
                .map(TicketCategorytoTicketCategoryDtoMapper::convert)
                .collect(Collectors.toList());
    }
}
