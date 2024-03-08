package com.fundamentals.main;
import com.fundamentals.practice.HousePhone;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        basicStatements();
//        houseExample();
        phoneExample();
    }

    // Single-Line Comment
    /* Multi-Line Comment
    This is the Second Line
    This is the Third Line.
     */

    public static void basicStatements() {
        System.out.println("This is my first sentence.");
        System.out.println("I am new to Java.");
        System.out.println("This Java course is cool.");
        System.out.println("I am learning stuff every day.");
    }

    public static void houseExample() {
        House myHouse = new House("Orange", "Cement'", "Slate Hip Roof", 33);
        myHouse.doorFunction();
        System.out.println(myHouse.getEntranceDoorColor());
    }

    public static void phoneExample() {
        int[] keys = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        HousePhone myHousePhone = new HousePhone(7, keys, 0, "LCD");
        myHousePhone.sendCall();
    }
}
