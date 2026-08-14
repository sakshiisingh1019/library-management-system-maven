package com.sakshi.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryServiceImpl implements LibraryService {

    private List<Book> books = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public LibraryServiceImpl() {
    books.add(new Book(1, "Java Basics"));
    books.add(new Book(2, "Clean Code"));
    books.add(new Book(3, "Effective Java"));
    }
    public void addBook() {
    System.out.print("Enter ID: ");
    int id = sc.nextInt();
    sc.nextLine();

    for (Book b : books) {
        if (b.getId() == id) {
            System.out.println("Book ID already exists.");
            return;
        }
    }
    System.out.print("Enter Title: ");
    String title = sc.nextLine();

    if (title.isBlank()) {
        System.out.println("Book title cannot be empty.");
        return;
    }
        books.add(new Book(id, title));
System.out.println("Book added successfully.");
}

    public void issueBook() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

       for (Book b : books) {
            if (b.getId() == id) {

                if (b.isIssued()) {
                    System.out.println("Book is already issued.");
                    return;
                }
                b.setIssued(true);
                System.out.println("Book issued successfully.");
                return;
            }
        }
        System.out.println("Not available");
    }

   public void returnBook() {
    System.out.print("Enter ID: ");
    int id = sc.nextInt();

    for (Book b : books) {
        if (b.getId() == id) {

            if (!b.isIssued()) {
                System.out.println("Book is not currently issued.");
                return;
            }
            b.setIssued(false);
            System.out.println("Book returned successfully.");
            return;
        }
    }
    System.out.println("Book not found.");
}

    public void viewBooks() {
        books.forEach(b ->
                System.out.println(b.getId() + " " + b.getTitle() + " " +
                        (b.isIssued() ? "Issued" : "Available"))
        );
    }
}
