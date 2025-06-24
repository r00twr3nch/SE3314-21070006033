package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for App class.
 */
class AppTest {

    @Test
    void testAppMainRunsWithoutError() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}
