package com.fundamentals.lessons;
import java.util.Scanner;

/* Lesson 6 - Using Operators */
public class Lesson6 {
    int sum1 = 23, sum2 = 45;

    /* Arithmetic Operators
    * Math is performed from left to right. */
    public void basicMath() {
        System.out.println(sum1 + sum2);
        System.out.println(sum2 - sum1);
        System.out.println(sum1 * sum2);
        System.out.println(sum2 / sum1);
    }

    public void justTheRemainder(int num) {
        int total = sum2 % num;
        System.out.println(total);
    }

    // Using PEMDAS to get answer
    public double mathOrder() {
        double total1 = (20 - 42) / 3.7 + 8.2 * 19 - 32;
        double total2 = 20 - 42 / (3.7 + 8.2) * 19 - 32;
        System.out.println(total1);
        return total2;
    }

    // Using Scanner to get User input
    public void addSomeNumbers() {
        int num1, num2, total;
        System.out.println("Enter two integers to calculate their sum: ");
        Scanner userInput = new Scanner(System.in);
        num1 = userInput.nextInt();
        num2 = userInput.nextInt();
        total = num1 + num2;
        System.out.println("The total of " + num1 + " and " + num2 + " is " + total);
    }

    /* Assignment Operators */
    public void demoAssignment(int num1, int num2) {
        num1 += num2;
        System.out.println("+= Operator " + num1);
        num2 -= num1;
        System.out.println("-= Operator " + num2);
        num1 *= num2;
        System.out.println("*= Operator " + num1);
        num1 /= num2;
        System.out.println("/= Operator " + num1);
        num2 %= num1;
        System.out.println("%= Operator " + num2);
    }

    /* Relational Operators - Values return a boolean answer.*/
    public void demoRelationalEquals(int valueA, int valueB) {
        boolean isEqualTo = valueA == valueB;
        boolean isNotEqualTo = valueA != valueB;
        System.out.println(valueA + " Is equal to " + valueB + " " + isEqualTo);
        System.out.println(valueA + " Is not equal to " + valueB + " " + isNotEqualTo);
    }

    public void demoRelationalGreater(int valueC, int valueD) {
        boolean isGreaterThan = valueC > valueD;
        boolean isLessThan = valueC < valueD;
        System.out.println(valueC + " Is greater than " + valueD + " " + isGreaterThan);
        System.out.println(valueC + " Is less than " + valueD + " " + isLessThan);
    }

    /* Compare equals() with == */
    public void compareEquals() {
        String name = new String("John");
        String name2 = new String("John");
        String name3 = name2;

        boolean isEqualOperator = name == name2;
        boolean isOtherEqualOperator = name2 == name3;
        System.out.println("== " + isEqualOperator);
        System.out.println("== w/name3 " + isOtherEqualOperator);
        boolean isEqualMethod = name2.equals(name3);
        boolean isEqualCompare = name.equals(name2);
        System.out.println("isEqualMethod " + isEqualMethod);
        System.out.println("isEqualCompare " + isEqualCompare);
    }

    /* Logical Operators */
    /* The Logical && Operator means both conditions
    * must be true for the result to be true. */
    public void demoLogicalAnd(int num1, int num2, int num3) {
        boolean answer = num1 != num2 && num3 > num2;
        System.out.println("Logical Operator and &&: " + answer);
    }

    /* The Logical || Operator means that only one condition
    * must be true for the result to be true. */
    public void demoLogicalOr(int num4, int num5, int num6) {
        boolean answer = num4 != num5 || num6 > num4;
        System.out.println("Logical Operator or ||: " + answer);
    }

    // Increment Operator
    public void makeMeIncrease() {
        int able = 10, num1, num2;
        // Post Increment - Value is computed then incremented
        num1 = able++;
        System.out.println(num1);
        System.out.println(able);
        // Pre Increment - Value is incremented then computed
        num2 = ++able;
        System.out.println(able);
        System.out.println(num2);
    }

    // Decrement Operator
    public void makeMeDecrease() {
        int beta = 10, num1, num2;
        // Post Decrement - Value is computed then Decremented
        num1 = beta--;
        System.out.println(num1);
        System.out.println(beta);
        // Pre Decrement - Value is Decremented then computed
        num2 = --beta;
        System.out.println(beta);
        System.out.println(num2);
    }

    public static void main(String[] args) {
        Lesson6 myLesson6 = new Lesson6();
//        myLesson6.basicMath();
//        myLesson6.justTheRemainder(7);
//        double total = myLesson6.mathOrder();
//        System.out.println(total);
//        myLesson6.addSomeNumbers();
//        myLesson6.demoAssignment(20, 6);
//        myLesson6.demoRelationalEquals(33, 66);
//        myLesson6.demoRelationalGreater(44, 77);
//        myLesson6.compareEquals();
//        myLesson6.demoLogicalAnd(5, 10 ,15);
//        myLesson6.demoLogicalOr(5, 10 ,15);
//        myLesson6.makeMeIncrease();
        myLesson6.makeMeDecrease();
    }
}
