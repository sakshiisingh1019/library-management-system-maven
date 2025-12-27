package com.sakshi.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplTest {

    @Test
    void dummyTest() {
        LibraryService service = new LibraryServiceImpl();
        assertNotNull(service);
    }
}
