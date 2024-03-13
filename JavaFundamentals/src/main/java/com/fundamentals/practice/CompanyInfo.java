package com.fundamentals.practice;

/* Practice for using Static */
public class CompanyInfo {
    static final String ADDRESS = "123 Main St.";
    static String company = "My Company";
    private int id;
    private String name;

    public CompanyInfo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("id :" + id + " Name: " + name + " Company: " + company);
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
//        CompanyInfo myCompanyInfo = new CompanyInfo();
//        myCompanyInfo.id = 10010;
//        myCompanyInfo.name = "Peter Parker";
//        myCompanyInfo.display();
//        CompanyInfo.company = "Daily Bugle";
//        myCompanyInfo.display();
    }
}

