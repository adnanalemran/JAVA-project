package com.example.beginnerjava;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {

        int num1, num2, result;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your 1s number: ");
        num1 = input.nextInt();
        input.nextLine();

        System.out.print("Enter your 2nd number: ");
        num2 = input.nextInt();

        result = num1 + num2;
        System.out.println("The sum is " + result);

        result = num1 - num2;
        System.out.println("The sub is " + result);

        result = num1 * num2;
        System.out.println("The mult is " + result);

        result = num1 / num2;
        System.out.println("The dev is " + result);

        result = num1 % num2;
        System.out.println("The reminder is " + result);
    }
}
