package com.example.configurator.model;

import jakarta.persistence.*;

@Entity
public class OptionCategory {
    @Id @GeneratedValue
    private Long id;
    private String name;

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

	public ProductTemplate getTemplate() {
		return template;
	}

	public void setTemplate(ProductTemplate template) {
		this.template = template;
	}

	@ManyToOne
    private ProductTemplate template;

    // Getters and Setters
}