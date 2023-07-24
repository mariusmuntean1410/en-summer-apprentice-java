package com.EndavaTicketManagement.practica.service.mapper;


import com.EndavaTicketManagement.practica.repository.model.TicketCategory;
import com.EndavaTicketManagement.practica.service.modelDTO.TicketCategoryDto;
import org.springframework.stereotype.Component;

@Component
public class TicketCategorytoTicketCategoryDtoMapper {

    public static TicketCategory convert(TicketCategoryDto ticketCategoryDto) {
        TicketCategory ticketCategory = new TicketCategory();
        ticketCategory.setTicketCategoryId(ticketCategoryDto.getTicketCategoryId());
        ticketCategory.setDescription(ticketCategoryDto.getDescription());
        ticketCategory.setPrice(ticketCategoryDto.getPrice());
        return ticketCategory;
    }

}
