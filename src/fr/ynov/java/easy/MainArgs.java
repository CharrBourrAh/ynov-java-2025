package fr.ynov.java.easy;

import java.util.Scanner;

public class MainArgs {
    public static void main(String[] args) {
calculator(9,6);
    }

    public static void calculator(int a, int b) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter an operator sign : ");
String operator = sc.nextLine();
switch (operator) {
    case "+" -> System.out.println(a + b);
    case "-" -> System.out.println(a - b);
    case "*" -> System.out.println(a * b);
    case "/" -> System.out.println(a / b);
    default -> System.out.println("Invalid operator");
}
    }
}
