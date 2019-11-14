package ru.lidzhiev.spring5webappMaven.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private java.lang.String name;
    private java.lang.String Address;

    public Publisher(java.lang.String name, java.lang.String address) {
        this.name = name;
        Address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getAddress() {
        return Address;
    }

    public void setAddress(java.lang.String address) {
        Address = address;
    }
}
