package com.company.Porterfield;

import java.util.*;
import java.util.Scanner;

public class Main {

    static void menu() {
        System.out.println("Please choose an option:");
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all tasks.");
        System.out.println("(5) List all tasks based on importance.");
        System.out.println("(0) Exit.");
    }

    static ArrayList<Item> addATask(ArrayList<Item> a) {
        Scanner input = new Scanner(System.in);
        Item task = new Item();

        System.out.println("Enter the new task's name: ");
        String title = input.nextLine();
        task.setTitle(title);

        System.out.println("Enter the new task's description: ");
        String description = input.nextLine();
        task.setDescription(description);

        System.out.println("Enter the new task's priority: ");
        int priority = input.nextInt();
        if (priority < 0) {
            priority = 0;
        }
        if (priority > 5) {
            priority = 5;
        }
        task.setPriority(priority);

        a.add(task);
        return a;
    }

    static ArrayList<Item> removeTask(ArrayList<Item> a) {

        int b;
        Scanner input = new Scanner(System.in);

        System.out.println("What task would you like to remove?");
        b = input.nextInt();
        a.remove(b);
        return a;
    }

    static ArrayList<Item> updateTask(ArrayList<Item> x) {
        Scanner input = new Scanner(System.in);
        int a;
        Item task = new Item();

        System.out.println("Please enter an index value of task to update: ");
        a = input.nextInt();
        input.nextLine();

        System.out.println("Enter the new task's name: ");
        String title = input.nextLine();
        task.setTitle(title);

        System.out.println("Enter the new task's description: ");
        String description = input.nextLine();
        task.setDescription(description);

        System.out.println("Enter the new task's priority: ");
        int priority = input.nextInt();
        input.nextLine();
        task.setPriority(priority);

        x.set(a, task);
        return x;
    }

    static void displayAllTasks(ArrayList<Item> taskList) {
        int i = 0;
        for (Item a : taskList) {
            System.out.println("Task Index: " + i + " | " + a);
            i++;
        }
    }

    static void displayPriority(ArrayList<Item> taskList) {
        Scanner input = new Scanner(System.in);
        int i = 0;
        int priority;

        System.out.println("Enter a level of priority: ");
        priority = input.nextInt();
        if (priority < 0) {
            priority = 0;
        }
        if (priority > 5) {
            priority = 5;
        }
        for (Item a : taskList) {
            if (priority == a.getPriority()) {
                System.out.println("Task Index: " + i + " | " + a);
            }
            i++;
        }
    }

    static void exitProgram() {
        System.exit(0);
    }

    public static void main(String[] args) {

        ArrayList<Item> taskList = new ArrayList<>();
        String userInput = "-1";

        while (!userInput.equals("0")) {
            Scanner input = new Scanner(System.in);
            try {
                menu();
                userInput = input.nextLine();


                switch (userInput) {
                    case "1":
                        addATask(taskList);
                        break;
                    case "2":
                        removeTask(taskList);
                        break;
                    case "3":
                        updateTask(taskList);
                        break;
                    case "4":
                        displayAllTasks(taskList);
                        break;
                    case "5":
                        displayPriority(taskList);
                        break;
                    case "0":
                        exitProgram();
                        break;
                    default:
                        System.out.println("Please enter a valid option.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect data type.");

            } catch (Exception e) {
                System.out.println("Something went wrong.");
            }
        }

    }
}
