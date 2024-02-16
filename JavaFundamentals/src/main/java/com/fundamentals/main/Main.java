package com.fundamentals.main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        houseExample();
    }

    // Single-Line Comment
    /* Multi-Line Comment
    This is the second line
    This is the third.
     */

    public static void houseExample() {
        House myHouse = new House();
        myHouse.doorFunction();
        myHouse.entranceDoorColor = "Orange";
        myHouse.foundationType = "Cement";
        myHouse.roofStyle = "Slate Hip Roof";
        myHouse.totalWindows = 33;
        System.out.println(myHouse.entranceDoorColor);
    }
}
