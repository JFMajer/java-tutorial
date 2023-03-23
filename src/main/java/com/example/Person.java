package com.example;

public class Person {
    private String name;
    private int age;
    static boolean canFly = false;

    public Person(String name, int age) {
        // fields
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " is " + age + " years old.";
    }

    // compare ages
    public boolean isOlderThan(Person other) {
        return this.age > other.age;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void celebrateBirthday() {
        this.age++;
        System.out.printf("%s says: it's my birthday, i just turned %d!%n", name, age);
    }

    static String getFavouriteProgrammingLanguage() {
        return "Java";
    }
}