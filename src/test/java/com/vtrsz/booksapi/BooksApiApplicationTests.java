package com.vtrsz.booksapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(locations = "file:src/test/resources/application-test.properties")
class BooksApiApplicationTests {

    @Test
    void contextLoads() {
    }

}
