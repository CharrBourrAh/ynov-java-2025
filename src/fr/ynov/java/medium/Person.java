package fr.ynov.java.medium;

public class Person {
    private final String name;
    private final int age;
    private final String gender;
    private final float height;
    private final float weight;
    private final Nationality nationality;

    public Person(String name, int age, String gender, float height, float weight, Nationality nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public static void main(String[] args) {

    }

    public void printPerson() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
        System.out.println(this.height);
        System.out.println(this.weight);

    }
}
