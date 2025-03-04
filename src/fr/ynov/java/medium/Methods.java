package fr.ynov.java.medium;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be squared: ");
        int a = sc.nextInt();
        System.out.println(square(a));
    }

    public static int square(int n) {
        return n * n;
    }
}

// What is the difference between a static method and a non-static method?

// A static method can be called by anyone without creating an object. A non-static method can only be called by an object from the class where the function is located
