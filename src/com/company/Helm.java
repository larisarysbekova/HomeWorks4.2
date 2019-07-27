package com.company;

public class Helm {
    private int helmSize;
    private String companyName;

    public int getHelmSize() {
        return helmSize;
    }

    public void setHelmSize(int helmSize) {
        this.helmSize = helmSize;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Helm(int helmSize, String companyName) {
        this.helmSize = helmSize;
        this.companyName = companyName;

    }
}

