package com.company.oopexample;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.setId("1234567890");
        company.setName("Java2023");
        company.setDateOfCreation("12.02.2005");

        CompanyET company1 = new CompanyET();
        company1.setCompanyOwner("John");
        company1.setActualCapital(123.22);
        company1.setFirstCapital(12.22);
        company1.profit();

        System.out.println(company1.profit());
    }
}
