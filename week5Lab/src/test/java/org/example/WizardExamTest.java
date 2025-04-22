package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WizardExamTest {

    @Test
    void testPassWithAllSpellsKnown() {
        WizardExam exam = new WizardExam();
        HogwartsStudent student = new HogwartsStudent("Hermione", "Gryffindor", 3);
        student.learnSpell("Lumos");
        student.learnSpell("Alohomora");
        exam.addRequiredSpell("Lumos");
        exam.addRequiredSpell("Alohomora");
        assertTrue(exam.pass(student));
    }

    @Test
    void testFailWhenMissingSpell() {
        WizardExam exam = new WizardExam();
        HogwartsStudent student = new HogwartsStudent("Ron", "Gryffindor", 3);
        student.learnSpell("Lumos");
        exam.addRequiredSpell("Lumos");
        exam.addRequiredSpell("Expelliarmus");
        assertFalse(exam.pass(student));
    }

    @Test
    void testEvaluatePrintsCorrectly() {
        WizardExam exam = new WizardExam();
        HogwartsStudent student = new HogwartsStudent("Ginny", "Gryffindor", 4);
        student.learnSpell("Reducto");
        exam.addRequiredSpell("Reducto");

        // This just checks no exceptions are thrown during printing
        assertDoesNotThrow(() -> exam.evaluate(student));
    }
}
