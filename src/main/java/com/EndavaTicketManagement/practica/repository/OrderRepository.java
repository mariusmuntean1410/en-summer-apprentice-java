package com.EndavaTicketManagement.practica.repository;
import com.EndavaTicketManagement.practica.repository.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Repository
public interface OrderRepository  extends  JpaRepository<Order, Long> {
    public Order findByNumberOfTickets(int numberOfTickets);
}
