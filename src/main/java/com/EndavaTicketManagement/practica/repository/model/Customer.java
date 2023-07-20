package com.EndavaTicketManagement.practica.repository.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Customer")

public class Customer implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int customerId;



    @Column(name = "name")
    private String name;

    @Column(name = "email", unique = true)
    private String email;


  public int getCustomerId() {
      return customerId;
  }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer() {

    }
}