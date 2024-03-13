package com.fundamentals.lessons;
import java.util.ArrayList;
import com.fundamentals.main.House;
import com.fundamentals.practice.CompanyInfo;

import java.util.function.Predicate;
import java.util.stream.Stream;

/* lesson 16 - Using Lambdas*/
public class Lesson16 {
    // Using no Lambda with Interface
    public void noLambda() {
        Lesson16Interface myLesson16Interface = new Lesson16Interface() {
            @Override
            public void aLesson16Method() {
                System.out.println("Lesson 16 Interface Method");
            }
        };
        myLesson16Interface.aLesson16Method();
    }

    // Using a Lambda Expression
    public void withLambda() {
        Lesson16Interface myLesson16Interface2 = () -> {
            System.out.println("Lesson 16 Interface Method from Lambda");
        };
        myLesson16Interface2.aLesson16Method();
    }

    // Lambda with Parameters
    public void multiplesLambda() {
        // using Parameter Declaration
        SimpleAdditionInterface simple = (value1, value2) -> (value1 + value2);
        System.out.println(simple.add(23, 65));
        // using Data Type Declaration
        SimpleAdditionInterface simple2 = (int sum1, int sum2) -> (sum1 + sum2);
        System.out.println(simple2.add(10, 12));
    }

    // Collection using forEach and Lambda
    public void listLambda() {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.forEach((value) -> System.out.println(value));
    }

    // Filter using Stream and Lambda
    public void filterLambda() {
        ArrayList<House> houses = getHouseList();
        Stream<House> filterHouses = houses.stream().filter(houseChoice -> houseChoice.getEntranceDoorColor().equals("Gray"));
        filterHouses.forEach(house -> System.out.println("Selections " + house.toString()));
    }

    // Filter using Predicate Interface and Lambda
    public void queryInfo(ArrayList<CompanyInfo> company, Predicate<CompanyInfo> expr) {
        ArrayList<CompanyInfo> results = new ArrayList<>();
        for(CompanyInfo info :  company) {
            if(expr.test(info)) {
                results.add(info);
            }
        }
        results.forEach(person -> System.out.println(person));
    }

    private ArrayList<House> getHouseList() {
        ArrayList<House> houseList = new ArrayList<>();
        houseList.add(new House());
        houseList.add(new House("Concrete", "Green"));
        houseList.add(new House("Wood", "Blue", "Cedar", 30));
        houseList.add(new House("Dirt", "Brown"));
        houseList.add(new House("Concrete", "Green", "Shingle", 35));
        houseList.add(new House());
        houseList.add(new House("Concrete", "Gray"));
        houseList.add(new House());
        houseList.add(new House("Dirt", "Brown", "Mud", 25));
        houseList.add(new House());
        return houseList;
    }

    public static ArrayList<CompanyInfo> getCompanyInfo() {
        ArrayList<CompanyInfo> info = new ArrayList<>();
        info.add(new CompanyInfo(1000, "John"));
        info.add(new CompanyInfo(1100, "Jane"));
        info.add(new CompanyInfo(1200, "Debra"));
        info.add(new CompanyInfo(2000, "Paul"));
        info.add(new CompanyInfo(2100, "Mike"));
        info.add(new CompanyInfo(2200, "Amy"));
        info.add(new CompanyInfo(1300, "kate"));
        return info;
    }

    public static void main(String[] args) {
        Lesson16 myLesson16 = new Lesson16();
//        myLesson16.noLambda();
//        myLesson16.withLambda();
//        myLesson16.multiplesLambda();
//        myLesson16.listLambda();
//        myLesson16.filterLambda();
        myLesson16.queryInfo(Lesson16.getCompanyInfo(), (id -> id.getId() < 2000));
    }
}
