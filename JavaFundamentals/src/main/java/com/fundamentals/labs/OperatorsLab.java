package com.fundamentals.labs;
import java.util.Scanner;

public class OperatorsLab {
    public void PEMDAS() {
        int answer1 = 10 + 32 * 12 / 3;
        int answer2 = (10 + 32) * 12 / 3;
        System.out.println(answer1);
        System.out.println(answer2);
    }

    public void assignmentOperators(int num1, int num2) {
        num1 += num2;
        System.out.println("The += Operator = "  + num1);
        num1 *= num2;
        System.out.println("The *= Operator = "  + num1);
        num1 %= num2;
        System.out.println("The %= Operator = "  + num1);
    }

    public int userInput() {
        int num1 = 5;
        System.out.println("Enter a integer to receive the remainder of division by 5: ");
        Scanner userNumber = new Scanner(System.in);
        int numInput = userNumber.nextInt();
        return(numInput % num1);
    }

    public static void main(String[] args){
        OperatorsLab myOperatorsLab = new OperatorsLab();
        myOperatorsLab.PEMDAS();
        myOperatorsLab.assignmentOperators(60, 30);
        System.out.println(myOperatorsLab.userInput());
    }
}
