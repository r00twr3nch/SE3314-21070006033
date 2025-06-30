package org.example;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents a wizarding exam that requires students to know specific spells.
 */
public class WizardExam {
    private Set<String> requiredSpells; 
    /**
     * Initializes an exam with no required spells
     * Effects: Creates an empty set of required spells.
     */
    public WizardExam() {
        requiredSpells = new HashSet<>();
    }

    /**
     * Adds a required spell to the exam.
     * @param spell The required spell.
     * Effects: If spell is valid, it is added in requiredSpells.
     */
    public void addRequiredSpell(String spell) {
        if (spell != null && !spell.isEmpty()) {
            requiredSpells.add(spell);
        }
    }

    /**
     * Checks if a student passes the exam.
     * @param student The student taking the exam.
     * @return true if student knows all required spells, false otherwise.
     * Effects: Returns true if all spells in requiredSpells are known by the student.
     */
    public boolean pass(HogwartsStudent student) {
        return student != null && requiredSpells.stream().allMatch(student::knowsSpell);
    }

    /**
     * Evaluates a student and prints the result
     * @param student The student taking the exam.
     * Effects: Prints whether the student passed or failed based on known spells.
     */
    public void evaluate(HogwartsStudent student) {
        if (pass(student)) {
            System.out.println(student.getName() + " has passed the exam!");
        } else {
            System.out.println(student.getName() + " has failed the exam.");
        }
    }
}
