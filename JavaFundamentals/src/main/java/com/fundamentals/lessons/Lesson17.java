package com.fundamentals.lessons;
import com.fundamentals.practice.Week;

/* Lesson 17 - Enumerations */
public class Lesson17 {
    // Enum within a Class
    public enum IceCreamFlavors {
        VANILLA, CHOCOLATE, STRAWBERRY, ROCKY_ROAD
    }

    public void showEnum() {
        Week day = Week.WED;
        System.out.println(day);
        System.out.println(IceCreamFlavors.STRAWBERRY);
        System.out.println(Week.THU);
    }

    // Use Enum for Switches
    public void myFavoriteFlavor(IceCreamFlavors flavors) {
        String msg = "My favorite ice cream flavor is ";
        switch(flavors) {
            case VANILLA:
                msg += "Vanilla";
                break;
            case CHOCOLATE:
                msg += "Chocolate";
                break;
            case STRAWBERRY:
                msg += "Strawberry";
                break;
            default:
                msg += "Rocky Road";
        }
        System.out.println(msg);
    }

    public void valueOrdinal() {
        Week[] week = Week.values();
        for(Week day : week) {
            System.out.println(day + " at index " + day.ordinal());
        }
        System.out.println(Week.valueOf("TUE"));
    }

    public void showEnumMethod() {
        Week day = Week.THU;
        System.out.println(day);
        day.weekMethod();
    }

    public void showEnumValues() {
        Week[] days = Week.values();
        for(Week day : days) {
            System.out.println("Week name " + day.name() + " Week #:" + day.getDayNum());
        }
    }

    public static void main(String[] args) {
        Lesson17 myLesson17 = new Lesson17();
//        myLesson17.showEnum();
//        myLesson17.myFavoriteFlavor(IceCreamFlavors.CHOCOLATE);
//        myLesson17.valueOrdinal();
//        myLesson17.showEnumMethod();
        myLesson17.showEnumValues();
    }
}
