package fr.ynov.java.easy;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        scanMe();
        evenOrOdd();
    }

    public static void scanMe() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = scanner.nextLine();
        System.out.println("Enter your age :");
        int age = scanner.nextInt();
        System.out.println("your name is : " + name + " and your age is : " + age);
    }

    public static void evenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
