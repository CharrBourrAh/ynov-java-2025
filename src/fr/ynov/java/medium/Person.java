package fr.ynov.java.medium;

import javax.xml.catalog.Catalog;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Person {
    private final String name;
    private final Calendar dateOfBirth;
    private final String gender;
    private final float height;
    private final float weight;
    private final Nationality nationality;

    public Person(String name, Calendar dateOfBirth, String gender, float height, float weight, Nationality nationalityArg) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationalityArg;
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(1990, Calendar.FEBRUARY, 1);
        Person person = new Person("John", cal, "Male", 1.80f, 80.F, Nationality.France);
        person.printPerson();
        System.out.println(person.age());
    }

    public void printPerson() {

        System.out.println(this.name);
        System.out.println(this.gender);
        System.out.println(this.height);
        System.out.println(this.weight);
        System.out.println(this.nationality);
    }

    public int age() {
        return LocalDate.now().getYear() - dateOfBirth.get(Calendar.YEAR);
    }
}
