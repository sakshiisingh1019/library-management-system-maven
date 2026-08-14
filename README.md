# Library Management System

A console-based Library Management System built using Java 17, Maven, and JUnit 5.

The project demonstrates object-oriented programming, service-based design, basic validation, collection handling, and unit testing.

## Features

- Add books to the library
- View available books
- Issue books
- Return books
- Load a small set of initial books for demonstration
- Prevent duplicate book IDs
- Validate empty book titles
- Handle invalid/non-existent book IDs
- Prevent issuing an already-issued book
- Prevent returning a book that is not currently issued

## Tech Stack

- Java 17
- Maven
- JUnit 5
- Java Collections (`ArrayList`)

## Project Structure

```text
library-management-system/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/sakshi/library/
│   │           ├── Book.java
│   │           ├── LibraryApp.java
│   │           ├── LibraryService.java
│   │           └── LibraryServiceImpl.java
│   │
│   └── test/
│       └── java/
│           └── com/sakshi/library/
│               ├── BookTest.java
│               └── LibraryServiceImplTest.java
│
├── pom.xml
└── README.md
```

## ARCHITECTURE

```text
LibraryApp : Handles user Interaction and the application menu
     │
     ▼
LibraryService : Defines the library operations
     │
     ▼
LibraryServiceImpl : Implements the library operations
     │
     ▼
   Book : Represents a book and its issue status.
   ```

## APPLICATION MENU 

The application provides a console-based menu for performing library operations:

1 Add Book
2 Issue Book
3 Return Book
4 View Books
5 Exit

The user selects an operation and provides the required input through the console.

## INITIAL BOOKS

The application starts with a small set of sample books to demonstrate the library functionality.

These books act as initial library data and can be issued, returned, or viewed through the application.
   
## VALIDATION

The application performs basic validation to maintain consistent library data.

Book IDs must be unique.
Book titles must not be empty.
A book that is already issued cannot be issued again.
A nonexistent book cannot be issued or returned.
A book can only be returned when it is currently issued.

## TESTING

The project uses JUnit 5 for unit testing.

Tests cover important functionality such as:

Adding books
Book properties
Duplicate book handling
Book issue operations
Already-issued book handling
Nonexistent book handling
Returning issued books
Returning available books

Run the tests using Maven:
mvn test

## FUTURE IMPROVEMENTS 

Store books in a database instead of an in-memory ArrayList
Add user/member management
Add book search functionality
Add due dates and fine calculation
Add a graphical or web-based interface
Add persistent data storage
