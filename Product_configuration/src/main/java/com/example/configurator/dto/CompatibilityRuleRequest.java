package com.example.configurator.dto;

public class CompatibilityRuleRequest {
    private String ruleType; // INCOMPATIBLE_WITH or REQUIRES
    private Long primaryChoiceId;
    private Long secondaryChoiceId;
	public String getRuleType() {
		return ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}
	public Long getPrimaryChoiceId() {
		return primaryChoiceId;
	}
	public void setPrimaryChoiceId(Long primaryChoiceId) {
		this.primaryChoiceId = primaryChoiceId;
	}
	public Long getSecondaryChoiceId() {
		return secondaryChoiceId;
	}
	public void setSecondaryChoiceId(Long secondaryChoiceId) {
		this.secondaryChoiceId = secondaryChoiceId;
	}
	public String getRuleType1() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getRuleType11() {
		// TODO Auto-generated method stub
		return null;
	}

}
