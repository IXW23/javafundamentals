package com.fundamentals.labs;

public class NumbersLab {
    public void numeralSystems() {
        short binary = 0b11101;
        byte hexadecimal = 0x1D;
        System.out.println(binary);
        System.out.println(hexadecimal);
    }

    public void wideningConversion(byte byte_value, short short_value, int int_value) {
        int byte_to_int = byte_value;
        long short_to_long = short_value;
        float int_to_float = int_value;
        System.out.println("My byte converted to a int is = " + byte_to_int);
        System.out.println("My short converted to a long is = " + short_to_long);
        System.out.println("My int converted to a float is = " + int_to_float);
    }

    public void narrowingConversion(double double_value, float float_value, long long_value) {
        long double_to_long = (long)double_value;
        int float_to_int = (int)float_value;
        short long_to_short = (short)long_value;
        System.out.println("My double converted to a long is = " + double_to_long);
        System.out.println("My float converted to a int is = " + float_to_int);
        System.out.println("My long converted to a short is = " + long_to_short);
    }
    
    public static void main(String[] args) {
        NumbersLab myNumbersLab = new NumbersLab();
        myNumbersLab.numeralSystems();
        myNumbersLab.wideningConversion((byte) 3, (short) 333,  3333);
        myNumbersLab.narrowingConversion(3_333_333_333D, 333_333_333.33F, 3_333_333L);
    }
}
