package fr.ynov.java.easy;

public class Scanners {
    public static void main(String[] args) {
        scanMe("Samy", 2);
        evenOrOdd(4);
        evenOrOdd(5);
    }

    public static void scanMe(String name, int age) {
        System.out.println("your name is : " + name + " and your age is : " + age);
    }

    public static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
