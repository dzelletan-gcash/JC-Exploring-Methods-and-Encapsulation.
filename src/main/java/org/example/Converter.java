package org.example;

public class Converter {
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        System.out.printf("%.1f degrees C is %.1f degrees F.%n", 25.0, celsiusToFahrenheit(25.0));
    }
}
