package fr.ynov.java.medium;

public class Person {
    private final String name;
    private final int age;
    private final String gender;
    private final float height;
    private final float weight;
    private Nationality nationality;

    public Person(String name, int age, String gender, float height, float weight, Nationality nationalityArg) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationalityArg;
    }

    public static void main(String[] args) {
        Person person = new Person("John", 25, "Male", 1.80f, 80.F, Nationality.France);
        person.printPerson();
    }

    public void printPerson() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);
        System.out.println(this.height);
        System.out.println(this.weight);
        System.out.println(this.nationality);
    }

}
