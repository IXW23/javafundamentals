package com.fundamentals.labs;

public class ConditionsLab {
    public void ifElseStatement(String color1, String color2) {
        if(color1.equals(color2)) {
            System.out.println(color1 + " is the same color as " + color2 + ".");
        } else {
            System.out.println(color1 + " is not the same color as " + color2 + ".");
        }
    }

    public String switchStatement(char grade) {
        String message;
        switch(grade) {
            case 'E':
                message = "Excellent Grade";
                break;
            case 'V':
                message = "Very Good Grade";
                break;
            case 'G':
                message = "Good Grade";
                break;
            case 'A':
                message = "Average Grade";
                break;
            case 'F':
                message = "Failed Grade";
                break;
            default:
                message = "Not a Valid Grade";
        }
        return message;
    }

    public static void main(String[] args) {
        ConditionsLab myConditionsLab = new ConditionsLab();
        myConditionsLab.ifElseStatement("orange", "orange");
        myConditionsLab.ifElseStatement("orange", "blue");
        System.out.println(myConditionsLab.switchStatement('E'));
        System.out.println(myConditionsLab.switchStatement('I'));
    }
}
