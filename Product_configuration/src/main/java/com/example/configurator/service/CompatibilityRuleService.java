package com.example.configurator.service;

import com.example.configurator.dto.CompatibilityRuleRequest;
import com.example.configurator.model.CompatibilityRule;
import com.example.configurator.model.CompatibilityRule.RuleType;
import com.example.configurator.model.OptionChoice;
import com.example.configurator.model.ProductTemplate;
import com.example.configurator.repository.CompatibilityRuleRepository;
import com.example.configurator.repository.OptionChoiceRepository;
import com.example.configurator.repository.ProductTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompatibilityRuleService {

    @Autowired
    private ProductTemplateRepository productTemplateRepository;

    @Autowired
    private OptionChoiceRepository optionChoiceRepository;

    @Autowired
    private CompatibilityRuleRepository compatibilityRuleRepository;

    public CompatibilityRule addCompatibilityRule(Long templateId, CompatibilityRuleRequest request) {
        // Validate template
        ProductTemplate template = productTemplateRepository.findById(templateId)
                .orElseThrow(() -> new RuntimeException("Product template not found"));

        // Validate primary option
        OptionChoice primaryChoice = optionChoiceRepository.findById(request.getPrimaryChoiceId())
                .orElseThrow(() -> new RuntimeException("Primary option choice not found"));

        // Validate secondary option
        OptionChoice secondaryChoice = optionChoiceRepository.findById(request.getSecondaryChoiceId())
                .orElseThrow(() -> new RuntimeException("Secondary option choice not found"));

        // Create rule
        CompatibilityRule rule = new CompatibilityRule();
        rule.setProductTemplate(template);
        rule.setPrimaryChoice(primaryChoice);
        rule.setSecondaryChoice(secondaryChoice);
        rule.setRuleType(RuleType.valueOf(request.getRuleType())); // Assumes string is valid

        return compatibilityRuleRepository.save(rule);
    }
}