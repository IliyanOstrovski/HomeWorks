package com.company.oopexample;

public class CompanyET extends Company{
    private String companyOwner;
    private double firstCapital;
    private double actualCapital;

    public String getCompanyOwner() {
        return companyOwner;
    }

    public void setCompanyOwner(String companyOwner) {
        this.companyOwner = companyOwner;
    }

    public double getFirstCapital() {
        return firstCapital;
    }

    public void setFirstCapital(double firstCapital) {
        this.firstCapital = firstCapital;
    }

    public double getActualCapital() {
        return actualCapital;
    }

    public void setActualCapital(double actualCapital) {
        this.actualCapital = actualCapital;
    }

    public double profit() {
        return actualCapital - firstCapital;
    }
}
