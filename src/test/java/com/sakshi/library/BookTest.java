package com.sakshi.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testBookCreation() {
        Book book = new Book(1, "Java Basics");

        assertEquals(1, book.getId());
        assertEquals("Java Basics", book.getTitle());
        assertFalse(book.isIssued());
    }

    @Test
    void testIssueBook() {
        Book book = new Book(2, "JUnit Guide");
        book.setIssued(true);

        assertTrue(book.isIssued());
    }
}
