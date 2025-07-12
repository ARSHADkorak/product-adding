package com.example.configurator.repository;

import com.example.configurator.model.CompatibilityRule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompatibilityRuleRepository extends JpaRepository<CompatibilityRule, Long> {
	List<CompatibilityRule> findByProductTemplate_Id(Long templateId);

	com.example.configurator.model.CompatibilityRule save(com.example.configurator.model.CompatibilityRule rule);
}