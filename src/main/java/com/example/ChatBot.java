package com.example;

import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, I'm Rock the ChatBot!");
        // ask user for a name
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s!%n", name);
    }
}
