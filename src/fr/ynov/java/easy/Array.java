package fr.ynov.java.easy;

public class Array {
    public static void main(String[] args) {
        int[] arr = intArray(10);
        arr[arr.length - 1] = 20;
        printIntArray(arr);
    }

    public static int[] intArray(int length) {
        return new int[length];
    }

    public static void printIntArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
