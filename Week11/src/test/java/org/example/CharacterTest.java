package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the Character class.
 */
class CharacterTest {

    @Test
    void testCharacterCreation() {
        Character aragorn = new Character("Aragorn", "Human", 87);
        assertNotNull(aragorn);
    }

    @Test
    void testPrintDetailsFrodo() {
        Character frodo = new Character("Frodo", "Hobbit", 50);
        assertDoesNotThrow(frodo::printDetails);
    }

    @Test
    void testPrintDetailsYoungHobbit() {
        Character sam = new Character("Sam", "Hobbit", 38);
        assertDoesNotThrow(sam::printDetails);
    }
}
