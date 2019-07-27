package com.company;

public class Wheel {
    private int wheelSize;
    private String companyName;

    public Wheel(int ruleSize, String companyName) {
        this.wheelSize = ruleSize;
        this.companyName = companyName;
    }

    public int getRuleSize() {
        return wheelSize;
    }

    public void setRuleSize(int ruleSize) {
        this.wheelSize = ruleSize;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
