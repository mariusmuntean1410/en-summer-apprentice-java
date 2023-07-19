package com.EndavaTicketManagement.practica.repository;

import com.EndavaTicketManagement.practica.repository.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerRepository {
    private  List<Customer> customers;

    public CustomerRepository() {
        System.out.println("Creating AccountRepository");
        customers = new ArrayList<>();
        customers.add(new Customer("123"));
        customers.add(new Customer("124"));
    }

    public List<Customer> getCustomers(){
        return customers;
    }

    public Customer getCustomer(String id){
        Optional<Customer> customer = customers.stream().filter(a-> id.equals(a.getCustomersId())).findFirst();
        if(customer.isPresent()){
            return customer.get();
        }
        return null;
    }
}