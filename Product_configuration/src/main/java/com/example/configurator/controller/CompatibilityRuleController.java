package com.example.configurator.controller;

import com.example.configurator.dto.CompatibilityRuleRequest;
import com.example.configurator.model.CompatibilityRule;
import com.example.configurator.service.CompatibilityRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product-templates")
public class CompatibilityRuleController {

    @Autowired
    private CompatibilityRuleService ruleService;

    @PostMapping("/{templateId}/compatibility-rules")
    public ResponseEntity<CompatibilityRule> addRule(
            @PathVariable Long templateId,
            @RequestBody CompatibilityRuleRequest request) {

        CompatibilityRule rule = ruleService.addCompatibilityRule(templateId, request);
        return ResponseEntity.ok(rule);
    }
}