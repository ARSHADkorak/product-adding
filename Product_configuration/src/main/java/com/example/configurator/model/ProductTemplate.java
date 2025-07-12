package com.example.configurator.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class ProductTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // One template can have many rules
    @OneToMany(mappedBy = "productTemplate", cascade = CascadeType.ALL)
    private List<CompatibilityRule> compatibilityRules;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CompatibilityRule> getCompatibilityRules() {
        return compatibilityRules;
    }

    public void setCompatibilityRules(List<CompatibilityRule> compatibilityRules) {
        this.compatibilityRules = compatibilityRules;
    }
}
