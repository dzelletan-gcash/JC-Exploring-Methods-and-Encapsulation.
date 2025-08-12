package org.example;

public class Computer {
    private String brand;
    private int ramInGB;

    public Computer() {
        this.brand = "Generic";
        this.ramInGB = 8;
    }

    public Computer(String brand) {
        this();
        this.brand = brand;
    }

    public Computer(String brand, int ramInGB) {
        this.brand = brand;
        this.ramInGB = ramInGB;
    }

    public void display(int i) {
        System.out.println("Computer " + i +": Brand = " + brand + ", RAM = " + ramInGB + "GB");
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.display(1);

        Computer computer2 = new Computer("Dell");
        computer2.display(2);

        Computer computer3 = new Computer("Dell", 16);
        computer3.display(3);
    }
}
