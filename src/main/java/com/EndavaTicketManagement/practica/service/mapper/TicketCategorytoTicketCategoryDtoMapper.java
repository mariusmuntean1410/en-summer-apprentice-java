package com.EndavaTicketManagement.practica.service.mapper;


import com.EndavaTicketManagement.practica.repository.model.TicketCategory;
import com.EndavaTicketManagement.practica.service.modelDTO.TicketCategoryDto;
import org.springframework.stereotype.Component;

@Component
public class TicketCategorytoTicketCategoryDtoMapper {

    public static TicketCategoryDto convert(TicketCategory ticketCategory) {
        TicketCategoryDto ticketCategoryDto = new TicketCategoryDto();
        ticketCategoryDto.setTicketCategoryId(ticketCategory.getTicketCategoryId());
        ticketCategoryDto.setDescription(ticketCategory.getDescription());
        ticketCategoryDto.setPrice(ticketCategory.getPrice());
        return ticketCategoryDto;
    }


}
