package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Chuyển Fahrenheit thành Celsius");
            System.out.println("2. Chuyển Celsius thành Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Sự lựa chọn: ");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Nhập độ F: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Chuyển độ F thành độ C: " + fahrenheitToCelsius(fahrenheit) + " C");
                    break;
                }
                case 2: {
                    System.out.println("Nhập độ C: ");
                    celsius = input.nextDouble();
                    System.out.println("Chuyển độ C thành độ F: " + celsiusToFahrenheit(celsius) + " F");
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}