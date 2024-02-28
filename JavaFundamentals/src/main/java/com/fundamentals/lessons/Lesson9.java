package com.fundamentals.lessons;

/* Lesson 9 - Arrays */
/* Arrays can have data that consists of objects
* and Primitive Data Types. */
public class Lesson9 {
    // An Array of int Values
    public void basicIntArray() {
        int[] intArray = {23, 45, 12, 8, 92, 103, 37};
        for(int i = 0; i < intArray.length; i++) {
            if(i < intArray.length - 1) {
                System.out.print(intArray[i] + ", ");
            } else {
                System.out.print(intArray[i]);
            }
        }
    }

    // An Array of String Values
    public void basicStringArray() {
        String[] stringArray = new String[4];
        stringArray[0] = "Happy";
        stringArray[1] = "Wednesday";
        stringArray[2] = "Gaming";
        stringArray[3] = "Day";
        for(int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }

    // Enhanced For Loop/For Each Loop
    public void enhancedForLoop() {
        int[] intArray = {23, 45, 4, 12, 92, 103, 37};
        for(int number : intArray) {
            System.out.println(number);
        }
    }

    // Two-Dimensional Array
    public void aTwoDimensionalArray() {
        int[][] myArray = {{23, 45}, {35, 46}, {57, 98}, {32, 48}};
        for(int i = 0; i < myArray.length; i++) {
            for(int j = 0; j < myArray[i].length; j++) {
                System.out.println("[" + i + "]" + "[" + j + "] = " + myArray[i][j]);
//                System.out.println(myArray[i][0] + " " + myArray[i][1]);
            }
        }
    }

    // Enhanced For Loop Two-Dimensional Array
    public void anEnhancedTwoDimensionalArray() {
        int[][] otherArray = {{32, 54}, {53, 64}, {75, 89}, {23, 84}};
        for(int[] ints : otherArray) {
            for(int anInt : ints) {
                System.out.print(anInt + ", ");
            }
        }
    }

    // Three-Dimensional Array
    public void aThreeDimensionalArray() {
        int[][][] threeD = {
                {{10, 11}, {12, 13}}, {{14, 15}, {16, 17}}
        };
        for(int a = 0; a < threeD.length; a++) {
            for(int b = 0; b < threeD[a].length; b++) {
                for(int c = 0; c < threeD[b].length; c++) {
                    System.out.println("[" + a + "][" + b + "][" + c + "] = " + threeD[a][b][c]);
                }
            }
        }
    }

    // Jagged Array
    public void aJaggedArray() {
        String[][] strArray = new String[1][3];
        strArray[0][0] = "Feb";
        strArray[0][1] = "Mar";
        strArray[0][2] = "Apr";
        for(String[] first : strArray) {
            for(String value : first) {
                System.out.println(value);
            }
        }
    }

    public static void main(String[] args) {
        Lesson9 myLesson9 = new Lesson9();
//        myLesson9.basicIntArray();
//        myLesson9.basicStringArray();
//        myLesson9.enhancedForLoop();
        myLesson9.aTwoDimensionalArray();
//        myLesson9.anEnhancedTwoDimensionalArray();
//        myLesson9.aThreeDimensionalArray();
//        myLesson9.aJaggedArray();
    }
}
