package com.example.configurator.model;

import jakarta.persistence.*;

@Entity
public class OptionChoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String value;

    private int priceDelta;

    // You can link this to a category if needed
    // For now keeping it simple

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getPriceDelta() {
        return priceDelta;
    }

    public void setPriceDelta(int priceDelta) {
        this.priceDelta = priceDelta;
    }
}
