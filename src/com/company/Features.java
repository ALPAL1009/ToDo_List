package com.company;

import java.util.Scanner;

public class Features {

    // instance variables
    Scanner input = new Scanner(System.in);
    String[] items = new String[10];

    // to-do items
    public void insertItems() {
        items[0] = "Exercise";
        items[1] = "Eat breakfast";
        items[2] = "Meditate";
        items[3] = "Laundry";
        items[4] = "Practice programming";
    }

    // menu
    public void showMenu() {
        System.out.println("========= ~ TODO Menu ~ ============ ");
        System.out.println("            1. View all to-do items              ");
        System.out.println("            2. Add to-do item              ");
        System.out.println("            3. Delete to-do item            ");
        System.out.println("            4. Exit                     ");
    }

    // user
    public int getOption() {
        System.out.print("\nEnter number here: ");
        int option = input.nextInt();
        input.nextLine();
        return option;
    }

    // view items
    public void viewItems() {
        System.out.println("-------------------------------");
        System.out.println("- TODO List - " + "\n" + "-------------------------------");
        int x = 1;
        boolean isEmpty = true;
        for (String item : items) {
            if (item != null) {
                System.out.println(x + ". " + item);
                isEmpty = false;
                x++;
            }
        }
        if (isEmpty)
            System.out.println("To-Do List is Empty.");
    }

    // adding to-do item
    public void addItem() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                System.out.print("Enter added item: ");
                items[i] = input.nextLine();
                System.out.println("\nAdded: " + items[i]);
                break;
            }
        }
    }

    // deleting to-do item
    public void deleteItem() {
        System.out.print("Enter deleted item number: ");
        int number = input.nextInt();

        if (number >= 1 && number <= 10 && items[number -1] != null) {
            items[number - 1] = null;

            String[] temp = new String[items.length];
            int tempIndex = 0;
            for (String item : items) {
                if (item != null) {
                    temp[tempIndex] = item;
                    tempIndex++;
                }
            }
            items = temp;
        } else
            System.out.println("\nError: Invalid item number");
    }
}
