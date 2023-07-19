package com.EndavaTicketManagement.practica.controller;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
   /* private CustomerService customerService;

    *//*
    AccountService will get injected here after it is created
     *//*
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
        System.out.println("Creating Customer Controller");
    }

    @GetMapping("/api/customer/{resourceId}")
    public String getCustomer(@PathVariable String resourceId){
        return customerService.getCustomer(resourceId);
    }

    @GetMapping("/api/customers")
    public List<Customer> getCustomer(){
        return customerService.getCustomers();
    }*/
}
