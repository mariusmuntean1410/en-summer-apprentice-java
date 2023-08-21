package com.EndavaTicketManagement.practica.controller;

import com.EndavaTicketManagement.practica.repository.model.Event;
import com.EndavaTicketManagement.practica.service.TicketCategoryService;
import com.EndavaTicketManagement.practica.service.modelDTO.TicketCategoryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/ticketCategories")
public class TicketCategoryController {

    private final TicketCategoryService ticketCategoryService;

    @Autowired
    public TicketCategoryController(TicketCategoryService ticketCategoryService) {
        this.ticketCategoryService = ticketCategoryService;
    }

    @GetMapping("/all")
    public List<TicketCategoryDto> getAllTicketCategories() {
        return ticketCategoryService.getAllTicketCategories();
    }

    @GetMapping("/byEvent/{eventId}")
    public List<TicketCategoryDto> getTicketCategoriesByEventId(@PathVariable Event eventId) {
        return ticketCategoryService.getTicketCategoriesByEventId(eventId);
    }
}