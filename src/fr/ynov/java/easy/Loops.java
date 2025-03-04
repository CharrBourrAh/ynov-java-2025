package fr.ynov.java.easy;

public class Loops {
    public static void main(String[] args) {
        System.out.println("forLoop :");
        forLoop();
        System.out.println("whileLoop :");
        whileLoop();
        System.out.println("doWhileLoop :");
        doWhileLoop();
    }

    public static void forLoop() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    public static void whileLoop() {
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
    }

    public static void doWhileLoop() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 11);
    }
}
