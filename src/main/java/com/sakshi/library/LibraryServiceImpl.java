package com.sakshi.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryServiceImpl implements LibraryService {

    private List<Book> books = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addBook() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        String title = sc.nextLine();

        books.add(new Book(id, title));
        System.out.println("Book added");
    }

    public void issueBook() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.getId() == id && !b.isIssued()) {
                b.setIssued(true);
                System.out.println("Book issued");
                return;
            }
        }
        System.out.println("Not available");
    }

    public void returnBook() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.getId() == id && b.isIssued()) {
                b.setIssued(false);
                System.out.println("Book returned");
                return;
            }
        }
        System.out.println("Invalid return");
    }

    public void viewBooks() {
        books.forEach(b ->
                System.out.println(b.getId() + " " + b.getTitle() + " " +
                        (b.isIssued() ? "Issued" : "Available"))
        );
    }
}
