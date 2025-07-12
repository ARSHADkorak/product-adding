package com.example.configurator.model;

import jakarta.persistence.*;

@Entity
public class CompatibilityRule {

    public enum RuleType {
        INCOMPATIBLE_WITH,
        REQUIRES
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private RuleType ruleType;

    @ManyToOne
    private ProductTemplate productTemplate;

    @ManyToOne
    private OptionChoice primaryChoice;

    @ManyToOne
    private OptionChoice secondaryChoice;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RuleType getRuleType() {
        return ruleType;
    }

    public void setRuleType(RuleType ruleType) {
        this.ruleType = ruleType;
    }

    public ProductTemplate getProductTemplate() {
        return productTemplate;
    }

    public void setProductTemplate(ProductTemplate productTemplate) {
        this.productTemplate = productTemplate;
    }

    public OptionChoice getPrimaryChoice() {
        return primaryChoice;
    }

    public void setPrimaryChoice(OptionChoice primaryChoice) {
        this.primaryChoice = primaryChoice;
    }

    public OptionChoice getSecondaryChoice() {
        return secondaryChoice;
    }

    public void setSecondaryChoice(OptionChoice secondaryChoice) {
        this.secondaryChoice = secondaryChoice;
    }
}
