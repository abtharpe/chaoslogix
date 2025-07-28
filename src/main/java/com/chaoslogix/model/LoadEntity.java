package com.chaoslogix.model;

import jakarta.persistence.*;

@Entity
public class LoadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
}
