package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // variables
        int aNumber = 2;
        int anotherNumber = 40;
        int ANumber = 100; // this is a different variable than aNumber
        int sum = aNumber + ANumber;
        System.out.printf("Sum of %d and %d is %d%n", aNumber, ANumber, sum);

        // primitive types
        int anInteger = 42; // integer = 4 bytes
        long bigInteger = 42949642347296L; // long = 8 bytes
        float aFloat = 3.14F; // float = 4 bytes
        double aDouble = 3.14; // double precision = 8 bytes
        double starsInUniverse = 1.1e21; // scientific notation 1.1 * 10^21
        System.out.printf("Stars in universe: %e%n", starsInUniverse);
        double hydrogenRadius = 5.29177210903e-11; // radius of hydrogen atom
        char aChar = 'a'; // char = 2 bytes
        char aDigit = '1'; // char = 2 bytes - not an integer
        boolean aBoolean = true; // boolean = 1 byte

        // string
        String aString = "Hello, World!"; // String is a class, not a primitive type

        // expressions
        // math operations
        int multiplyInt = 2 * 3;
        int divideInt = 7 / 3;
        System.out.printf("7 / 3 = %d%n", divideInt);
        int remainderInt = 7 % 3;
        System.out.printf("7 %% 3 = %d%n", remainderInt);

        // increment and decrement
        int i = 0;
        i++; // i = i + 1
        System.out.printf("i = %d%n", i);
        ++i; // i = i + 1

        int someInteger = 4;
        int someInteger2 = someInteger++; // someInteger2 = 4, someInteger = 5
        System.out.printf("someInteger2 = %d, someInteger = %d%n", someInteger2, someInteger);
        int someInteger3 = ++someInteger; // someInteger3 = 6, someInteger = 6
        System.out.printf("someInteger3 = %d, someInteger = %d%n", someInteger3, someInteger);

        // math operators on decimals
        double aDoubleSum = 3.14 + 2.71;
        double divideDouble = 7.0 / 3;
        System.out.printf("7.0 / 3 = %f%n", divideDouble);
        double anotherDivision = 7 / 3;
        System.out.printf("7 / 3 = %f%n", anotherDivision);

        // character operations
        char aChar2 = 'a';
        aChar2++; // aChar2 = 'b'
        System.out.printf("aChar2 = %c%n", aChar2);
        // show ASCII code
        System.out.printf("aChar2 = %d%n", (int) aChar2);
        char aQuote = '\'';
        char tab = '\t';
        char newLine = '\n';
        char backslash = '\\';

        // boolean operations
        boolean numberIsTooBig = aNumber > 10; // false
        System.out.printf("aNumber > 10 = %b%n", numberIsTooBig);
        boolean isLetterMyFavorite = aChar == 'a';
        boolean smallOddNumber = (aNumber < 10) && (aNumber % 2 == 1); // true
        boolean negate = !smallOddNumber; // false

        // string operations
        String concatenation = "I love " + "Java!"; // "I love Java!"
        System.out.println(concatenation);
        System.out.println("Main.main");

        // instructions
        aNumber = 45; // aNumber becomes 45
        aNumber += 5; // aNumber becomes 50
        aNumber = aNumber + 5; // aNumber becomes 55
        System.out.printf("Sum of %d and %d is %d%n", aNumber, ANumber, sum); // old variables are still in scope

        // control statements
        int age = 38;
        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age < 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

        int temperature = 31;
        if (temperature < 20) {
            System.out.println("It's cold. Take a jacket");
        } else {
            if (temperature < 30) {
                System.out.println("It's warm. Take a sweater");
            } else {
                System.out.println("It's hot. Take a t-shirt");
            }
        }

        // while loops
        System.out.println("Watch me count to 10!");
        int x = 1;
        while (x <= 10) {
            System.out.println(x);
            x++;
        }

        // do-while loops
        x = 1;
        do {
            System.out.println(x);
            x++;
        } while (x <= 10);

        System.out.println("Using for loop");
        // for loops
        for (int counter = 0; counter <+ 10; counter++) {
            System.out.println(counter);
        }

        // reference types
        String username1 = "Alice";
        int userAge1 = 25;
        String username2 = "Bob";
        int userAge2 = 30;
        System.out.println(username1 + " says to " + username2 + ": \"You are " + (userAge2 - userAge1) + " years older than me!\"");

        Person alice = new Person("Alice", 25);
        Person bob = new Person("Bob", 30);
        System.out.println(alice.getName() + " is " + alice.getAge() + " years old.");
        System.out.println(bob);
        //compare ages
        System.out.println(alice.getName() + " is older than " + bob.getName() + ": " + alice.isOlderThan(bob));
        alice.setAge(32);
        System.out.println(alice.getName() + " is older than " + bob.getName() + ": " + alice.isOlderThan(bob));
        System.out.println(alice);
        // alice.age=100; // not possible, age is private


    }
}


class Person {
    private String name;
    private int age;

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
}
