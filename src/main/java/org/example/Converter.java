package org.example;

public class Converter {
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0/9.0;
    }

    public static void main(String[] args) {
        System.out.printf("%.1f degrees C is %.1f degrees F.%n", 25.0, celsiusToFahrenheit(25.0));
        System.out.printf("%.1f degrees F is %.1f degrees C.%n", 77.0, fahrenheitToCelsius(77.0));
    }
}
