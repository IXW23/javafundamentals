package com.fundamentals.lessons;

/* Lesson 8 Looping Statements */
/* Looping Statements require 3 key factors:
* 1. Initialized Value
* 2. The Condition to be checked
* 3. The Increment or Decrement */
public class Lesson8 {
// The While Loop
    public void aLittleWhileLoop(int total) {
        int num = 0; // Initialize Value
        while(num <= total) { // Condition
            System.out.print(num + ", ");
            num++; // Increment
        }
    }

    public void countdown() {
        int count = 10;
        while (count >= 0) {
            System.out.print(count + ", ");
            count--;
        }
    }

    /* Do  While Loop - The Code Block is
    * executed once prior to checking the Condition.*/
    public void aDoWhileLoop() {
        int start = 0;
        do {
            if (start % 2 == 0) {
                System.out.print(start + " ");
            }
            start++;
        } while(start <= 20);
    }

    // For Loop - More compact way of doing Loops
    public void aForLoop(int total) {
        for(int i = 0; i < total; i++) {
            System.out.print(i + " ");
        }
    }

    // Looping within another Loop/Nested Loop
    public void multiLoop(int first, int second) {
        for(int i = 0; i < first; i++) {
            for(int j = 0; j < second; j++) {
                System.out.print("(" + i + "," + j + ")");
            }
            System.out.println();
        }
    }

    // Branching Statements
    public void branchingExample() {
        for(int i = 0; i < 6; i++) {
            if(i == 2) {
                continue;
            }
            if(i == 4) {
                System.out.println("The Loop ends");
                break;
            }
            if(i == 3) {
                System.out.println("Three");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Lesson8 myLesson8 = new Lesson8();
//        myLesson8.aLittleWhileLoop(10);
//        myLesson8.countdown();
//        myLesson8.aDoWhileLoop();
//        myLesson8.aForLoop(14);
//        myLesson8.multiLoop(5, 3);
        myLesson8.branchingExample();
    }
}
