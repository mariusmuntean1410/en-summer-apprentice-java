package com.EndavaTicketManagement.practica.repository;

import com.EndavaTicketManagement.practica.repository.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {




    }

