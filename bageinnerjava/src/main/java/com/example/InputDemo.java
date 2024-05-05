package com.example;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompting the user to enter their name
        System.out.print("Enter your name: ");

        // Reading the input provided by the user
        String name = input.nextLine();

        // Prompting the user to enter their age
        System.out.print("Enter your age: ");

        // Reading the input provided by the user
        int age = input.nextInt();

        // Displaying the user's input
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        input.close();
    }
}
