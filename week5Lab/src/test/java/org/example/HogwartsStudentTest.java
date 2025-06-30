package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HogwartsStudentTest {

    @Test
    void testLearnValidSpell() {
        HogwartsStudent student = new HogwartsStudent("Hermione", "Gryffindor", 3);
        assertTrue(student.learnSpell("Alohomora"));
        assertTrue(student.knowsSpell("Alohomora"));
    }

    @Test
    void testLearnNullSpell() {
        HogwartsStudent student = new HogwartsStudent("Ron", "Gryffindor", 3);
        assertFalse(student.learnSpell(null));
    }

    @Test
    void testLearnDuplicateSpell() {
        HogwartsStudent student = new HogwartsStudent("Harry", "Gryffindor", 3);
        student.learnSpell("Lumos");
        assertFalse(student.learnSpell("Lumos")); // Already known
    }

    @Test
    void testKnowsSpell() {
        HogwartsStudent student = new HogwartsStudent("Neville", "Gryffindor", 3);
        student.learnSpell("Lumos");
        assertTrue(student.knowsSpell("Lumos"));
        assertFalse(student.knowsSpell("Expelliarmus"));
    }
}
