package com.fundamentals.lessons;
import com.fundamentals.main.House;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Lesson 18 - Exception Handling*/
public class Lesson18 {
    House ranch;

    // Throws
    public void exampleThrows() throws NullPointerException {
        System.out.println(ranch.getTotalWindows());
    }

    // Throw
    public void throwHouse(House house) {
        if(house == null) {
            throw new NullPointerException("House Object is null");
        } else {
            System.out.println(house.getTotalWindows());
        }
    }

    // Using Try/Catch With Scanner
    public void addNumberV2() {
        int num1 = 0, num2 = 0, total;
        System.out.println("Enter two integers to calculate their sum: ");
        Scanner userInput = new Scanner(System.in);
        try {
            num1 = userInput.nextInt();
            num2 = userInput.nextInt();
            total = num1 + num2;
            System.out.println("The total of " + num1 + " and " + num2 + " is " + total);
        } catch(InputMismatchException ime) {
            System.out.println("Please enter numeric values. Not words.");
        }
    }

    // Finally Block
    public void exampleFinally() {
        try {
//            ranch = new House();
            System.out.println(ranch.getTotalWindows());
        } catch(NullPointerException npe) {
            System.out.println("Null Pointer called " + npe.getMessage());
        } finally {
            System.out.println("The finally Block was called.");
        }
    }

    // more than one catch
    public void myArrayException() {
        String[] names = {"Dave", "Matt", "Jody"};
        String[] values = {"243", "424", "542"} ;
        try {
            byte value = Byte.parseByte(values[1]);
            System.out.println(value);
        } catch(IndexOutOfBoundsException ex) {
            System.out.println("Please provide a proper index value.");
        } catch(NumberFormatException nfe) {
            System.out.println("This is not a correct number.");
        } catch(StackOverflowError soe) {
            System.out.println("You have given me more than a byte.");
        } catch(Exception ex) {
            System.out.println("Here is the Exception: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        Lesson18 myLesson18 = new Lesson18();
//        myLesson18.exampleThrows();
//        myLesson18.throwHouse(new House());
//        myLesson18.addNumberV2();
//        myLesson18.exampleFinally();
        myLesson18.myArrayException();
    }
}
