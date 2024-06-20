package Sprint1_Java;

import java.util.Scanner;

import Week7.Cat;

public class LibraryMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println("Welcome to the Library Management System");
            System.out.println();
            System.out.println("1. Add Library Item");
            System.out.println("2. Edit Library Item");
            System.out.println("3. Delete Library Item");
            System.out.println("4. Borrow Library Item");
            System.out.println("5. Return Library Item");
            System.out.println("6. Exit");
            System.out.println();
            System.out.print("Enter your choice (1-6): ");
            System.out.println();
            choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Adding a new library item...");
                    System.out.println();
                    Cat cat = new Cat("Spots");
                    System.out.println(cat);
                    break;
                case 2:
                    System.out.println("Editing an existing library item...");
                    System.out.println();
                    Patron patron = new Patron("John","sdfsd",);
                    System.out.println(patron);
                    break;
                case 3:
                    System.out.println("Deleting a library item...");
                    // Add logic to delete a library item
                    break;
                case 4:
                    System.out.println("Borrowing a library item...");
                    // Add logic to borrow a library item
                    break;
                case 5:
                System.out.println("Returning a library item...");
                // Add logic to return a library item
                    break;
                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
