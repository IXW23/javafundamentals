package com.fundamentals.lessons;

/* Lesson 7 Conditional Statements */
public class Lesson7 {
    // Basic if Statement
    public void amIGreater(int value1, int value2) {
        System.out.println("Before If Statement");
        if(value1 >= value2) {
            System.out.println(value1 + " is greater than or equal to " + value2);
        }
        System.out.println("After If Statement");
    }

    // Basic if/else Statement
    public void amIGreaterOrNot(String name1, String name2) {
        System.out.println("Before if/else Statement");
        if(name1.equals(name2)) {
            System.out.println(name1 + " is equal to " + name2);
        } else {
            System.out.println(name1 + " is not equal to " + name2);
        }
        System.out.println("After if/else Statement");
    }

    // Two independent if Statements\
    public void justTwoIfs(int num1, int num2) {
        System.out.println("Two ifs not tied to each other");
        if(num1 > 10) {
            System.out.println(num1 + " is greater than 10");
        }

        if(num2 < 100) {
            System.out.println(num2 + " is less than 100");
        }
    }

    // if/else chain
    public String checkScores(int score) {
        if(score < 20) {
            return "The score is less than 20.";
        } else if(score <= 30) {
            return "The score is between 20 and 30.";
        } else if(score <= 40) {
            return "The score is between 31 and 40.";
        } else {
            return  "The score is greater than 40.";
        }
    }

    // && or || Logical Statements
    public void theOrTheAnd(int value) {
        if(value > 100 || value < 50) {
            System.out.println("The Value is less than 50 or greater than 100.");
        }

        if(value % 2 == 0 && value < 30) {
            System.out.println("The Value is less than 30 and even.");
        }
    }

    // Switch Statements
    public String pizzaFlavors(String flavor) {
        String message;
        switch(flavor) {
            case "pepperoni":
                message = "I love pepperoni pizza.";
                break;
            case "hamburger":
                message = "I love hamburger pizza.";
                break;
            case "cheese":
                message = "I love cheese pizza.";
                break;
            default:
                message = "I love to eat " + flavor + " pizza";
        }
        return message;
    }

    public static void main(String[] args) {
        Lesson7 myLesson7 = new Lesson7();
//        myLesson7.amIGreater(60,30);
//        myLesson7.amIGreaterOrNot("Ian", "John");
//        myLesson7.justTwoIfs(12, 15);
//        System.out.println(myLesson7.checkScores(33));
//        myLesson7.theOrTheAnd(6);
        System.out.println(myLesson7.pizzaFlavors("pepperoni"));
    }
}
