package com.example.configurator.controller;

import com.example.configurator.model.ProductTemplate;
import com.example.configurator.service.ProductTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/product-templates")
public class ProductTemplateController {

    @Autowired
    private ProductTemplateService productTemplateService;

    @PostMapping
    public ResponseEntity<ProductTemplate> create(@RequestBody Map<String, String> request) {
        return ResponseEntity.ok(productTemplateService.createTemplate(request.get("name")));
    }
}