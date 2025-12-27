package com.sakshi.library;

import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {

        LibraryService service = new LibraryServiceImpl();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1 Add  2 Issue  3 Return  4 View  5 Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> service.addBook();
                case 2 -> service.issueBook();
                case 3 -> service.returnBook();
                case 4 -> service.viewBooks();
                case 5 -> System.exit(0);
                default -> System.out.println("Invalid");
            }
        }
    }
}
