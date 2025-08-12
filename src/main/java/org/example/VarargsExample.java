package org.example;

public class VarargsExample {

    public static void printMessages(String... messages) {
        System.out.println("Number of messages: " + messages.length);
        for (String msg : messages) {
            System.out.print(msg + " ");
        }
        System.out.println("\n");
    }

    public static int findLargest(int... numbers) {
        int max;
        if (numbers.length == 0) return Integer.MIN_VALUE;
        else {
            max = numbers[0];
            for (int n : numbers) {
                if (n > max) max = n;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        printMessages("Hello", "World");
        printMessages("Testing", "Varargs", "Here");
        printMessages();
        System.out.println("Largest in (10, 5, 25, 15) is: " + findLargest(10, 5, 25, 15));
        System.out.println("Largest in (-5, -1, -10) is: " + findLargest(-5, -1, -10));
        System.out.println("Largest with no numbers is: " + findLargest());
    }
}
