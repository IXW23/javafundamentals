package com.fundamentals.lessons;
import com.fundamentals.main.House;

/* Lesson 19 - Writing Unit Tests */
public class Lesson19 {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public char[] myCharExample() {
        return new char[] {'U', 'n', 'i', 't', 'T', 'e', 's', 't'};
    }

    public boolean isGreaterExample(int valueA, int valueB) {
        return valueA > valueB;
    }

    public House myHouseExample(House house) {
        return house;
    }
}
