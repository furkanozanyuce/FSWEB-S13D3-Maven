package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;

    String hairColor;
    String eyeColor;
    double weight;

    /* ------------------------CONSTRUCTORS--------------------- */

    public Person(String firstname, String lastName, int age) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String hairColor, String eyeColor, double weight) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.weight = weight;
    }

    public Person(String firstname, String lastName, int age, String hairColor) {
        this(firstname, lastName, age);
        this.hairColor = hairColor;
    }

    /* ------------------------METHODS--------------------- */

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        if(age >= 13 && age <= 19) {
            return true;
        }
        return false;
    }
}
