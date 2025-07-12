package com.example.configurator.service;

import com.example.configurator.model.ProductTemplate;
import com.example.configurator.repository.ProductTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductTemplateService {
    @Autowired
    private ProductTemplateRepository templateRepo;

    public ProductTemplate createTemplate(String name) {
        ProductTemplate pt = new ProductTemplate();
        pt.setName(name);
        return templateRepo.save(pt);
    }
}