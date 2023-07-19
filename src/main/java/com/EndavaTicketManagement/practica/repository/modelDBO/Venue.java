package com.EndavaTicketManagement.practica.repository.modelDBO;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Venue")

public class Venue implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int venueId;


    @Column(name ="location")
    private String location;

    @Column(name ="type")
    private String type;

    @Column(name ="capacity")
    private int capacity;



    public Venue() {

    }

}