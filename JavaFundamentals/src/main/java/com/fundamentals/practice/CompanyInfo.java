package com.fundamentals.practice;

/* Practice for using Static */
public class CompanyInfo {
    static  String company = "My Company";
    int id;
    String name;

    public void display() {
        System.out.println("id :" + id + " Name: " + name + " Company: " + company);
    }

    public static void main(String[] args) {
        CompanyInfo myCompanyInfo = new CompanyInfo();
        myCompanyInfo.id = 10010;
        myCompanyInfo.name = "Peter Parker";
        myCompanyInfo.display();
        CompanyInfo.company = "Daily Bugle";
        myCompanyInfo.display();
    }
}

