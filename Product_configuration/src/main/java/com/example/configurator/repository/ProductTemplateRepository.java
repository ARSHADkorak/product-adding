package com.example.configurator.repository;

import com.example.configurator.model.ProductTemplate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductTemplateRepository extends JpaRepository<ProductTemplate, Long> {}