package com.fundamentals.lessons;

/* Lesson 5: Primitive Data Types */
// These Data Types don't share State like Objects
public class Lesson5 {
    /* This Primitive Type has a Value Range of
    * -128 to 127. The Class version of this Primitive
    * is Byte. */
    byte myByte = 3;

    /* This Primitive Type has a Value Range of
     * -32768 to 32767. The Class version of this Primitive
     * is Short. */
    short myShort = 235;

    /* This Primitive Type has a Value Range of
     * -2,147,483,648 to 2,147,483,647. The Class version of
     * this Primitive is Integer. */
    int myInt = 2354;

    /* This Primitive Type has a Value Range of
     * -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
     * The suffix of L or l is needed to separate it from int.
     * The Class version of this Primitive is Long. */
    long myLong = 56864L;

    /* This Primitive Type has a Value Range of 3.4E-38 3.4E+38.
    * The suffix of F or f is needed to separate it from a double.
    * The Class version of this Primitive is Float. */
    float myFloat = 34.53F;

    /* This Primitive Type has a Value Range of 1.7E-308 1.7E+308.
     * The suffix of D or d is optional. The Class version of
     * this Primitive is Double. */
    double myDouble = 84.98;
    double myOtherDouble = 36.43D;

    // Scientific Notation
    double myNotation = 23.65E8;

    /* Numeric Systems */
    // Decimal Value of 26;
    int myDecimal = 26;

    // Binary Value of 26;
    short myBinary = 0b11010;

    // Hexadecimal Value of 26;
    byte myHexadecimal = 0x1a;

    // Use underscores to make numbers readable
    long usingUnderscores = 4_568_987_367L;

    /* Variable Types */
    // A Method that shows a Local Variable
    public void showLocalExample() {
        double pi = 3.14;
        // below Variable also created at the Class level.
        double myDouble = 43.22;
        System.out.println(pi);
        // uses Local Scope over Instance Scope at Method Level.
        System.out.println(myDouble);
    }

    // A Method that shows an Instance Variable
    public int showInstanceExample() {
        // uses Instance Variable at the Class level.
        System.out.println(myDouble);
        return myDecimal;
    }

    /* Data Type Conversion is the concept of
    * converting between different Primitive Data Types.
    * When going from a floating point number to a whole
    * number Value, there is no rounding. The value is truncated. */

    /* Widening/Implicit type conversion is done when
    * two Data Types automatically convert. */
    public void Widening(long num2) {
        long converted = myInt;
        float value = num2;
        short small = myByte;
        System.out.println("My samples are " + converted + " & " + value);
        System.out.println("My small is " + small);
    }

    /* Narrowing/Explicit type conversion is done
    * when two Data Types convert, but require a direct
    * boxing affect. This is because a larger Data type
    * is converting to a smaller one, which will have
    * precision loss. */
    public void Narrowing() {
        long sample2 = (long)myDouble;
        int sample3 = (int)usingUnderscores;
        byte sample4 = (byte)myFloat;
        System.out.println("My sample2 = " + sample2);
        System.out.println("My sample3 = " + sample3);
        System.out.println("My sample4 = " + sample4);
    }

    public static void main(String[] args) {
        Lesson5 myLesson5 = new Lesson5();
//        myLesson5.showLocalExample();
//        int value = myLesson5.showInstanceExample();
//        System.out.println(value);
//        System.out.println(myLesson5.usingUnderscores);
//        System.out.println(myLesson5.myBinary);
//        System.out.println(myLesson5.myHexadecimal);
        myLesson5.Widening(myLesson5.myLong);
        myLesson5.Narrowing();
    }
}
