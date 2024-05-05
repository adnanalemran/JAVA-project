package com.example.beginnerjava;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter  id : ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter  title: ");
        String title = input.nextLine();

        System.out.print("Enter price: ");
        int price = input.nextInt();
        input.nextLine();
        
        System.out.print("Enter description :");
        String description = input.nextLine();

        System.out.print("Enter category: ");
        String category = input.nextLine();

        System.out.println("Product ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);
    }
}
