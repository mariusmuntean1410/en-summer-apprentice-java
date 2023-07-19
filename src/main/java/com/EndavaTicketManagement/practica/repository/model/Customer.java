package com.EndavaTicketManagement.practica.repository.model;


public class Customer {
    private String customerId;

    public Customer(String customerId) {
        this.customerId = customerId;
        System.out.println("Creating Customer");
    }

    public String getCustomersId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Customer{customerId='" + customerId + "'}";
    }
}