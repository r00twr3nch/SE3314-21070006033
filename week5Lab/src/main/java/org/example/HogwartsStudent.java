package org.example;
import java.util.HashSet;
import java.util.Set;

/**
 * Represents a Hogwarts student who learns and uses spells.
 * Each student belongs to a house and has a list of learned spells.
 */
public class HogwartsStudent {
    private String house; 
    private String name; 
    private int year;
    private Set<String> spellsLearned; 

    /**
     * Constructs a new Hogwarts student.
     * @param name  The student's name. 
     * @param house The house of the student. 
     * @param year  The study year of the student. 
     * Effects: Initializes a student with an empty spell list.
     */
    public HogwartsStudent(String name, String house, int year) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name cannot be null or empty");
        if (house == null || house.isEmpty()) throw new IllegalArgumentException("House cannot be null or empty");
        if (year < 1 || year > 7) throw new IllegalArgumentException("Year must be between 1 and 7");

        this.name = name;
        this.house = house;
        this.year = year;
        this.spellsLearned = new HashSet<>();
    }

    /**
     * Attempts to add a new spell to the student's learned spells.
     * @param spell The spell to learn. 
     * @return true if the spell was learned, false otherwise.
     * Effects: If spell is valid and not already known, it is added to spellsLearned.
     */
    public boolean learnSpell(String spell) {
        if (spell == null || spell.isEmpty() || spellsLearned.contains(spell)) {
            return false;
        }
        spellsLearned.add(spell);
        return true;
    }

    /**
     * Checks if the student knows a specific spell.
     * @param spell The spell to check. 
     * @return true if the student knows the spell, false otherwise.
     * Effects: Returns whether the spell exists in spellsLearned.
     */
    public boolean knowsSpell(String spell) {
        return spellsLearned.contains(spell);
    }

    // Getters
    public String getName() { return name; }
    public String getHouse() { return house; }
    public int getYear() { return year; }
}
