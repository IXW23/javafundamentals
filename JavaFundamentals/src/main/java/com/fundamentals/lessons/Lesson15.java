package com.fundamentals.lessons;

/* Lesson 15 - Abstraction - Abstract Classes and Interfaces */
public class Lesson15 implements Lesson15Interface {
    @Override
    public void turnOnDevice() {
        System.out.println("Device is turned on.");
    }

    public static void main(String[] args) {
        Lesson15 myLesson15 = new Lesson15();
        System.out.println(Lesson15.LED);
        myLesson15.turnOnDevice();
        myLesson15.increaseVolume(12);
        System.out.println(Lesson15Interface.isEnergyEfficient("LED"));
    }
}
