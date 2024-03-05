package com.fundamentals.labs;

public class StaticLab {
    public static double voltageUnknownValue(double current, double resistance) {
        double voltage = current * resistance;
        return(voltage);
    }

    public static double currentUnknownValue(double voltage, double resistance) {
        double current = voltage / resistance;
        return(current);
    }

    public static double resistanceUnknownValue(double voltage, double current) {
        double resistance = voltage / current;
        return(resistance);
    }

    public static void main(String[] args) {
        System.out.println(voltageUnknownValue(30, 60));
        System.out.println(currentUnknownValue(90, 30));
        System.out.println(resistanceUnknownValue(90, 30));
    }
}
