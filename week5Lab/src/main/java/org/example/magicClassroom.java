package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Represents a classroom that holds students.
 */
public class MagicClassroom {
    private List<HogwartsStudent> students;

    /**
     * Initializes an empty classroom.
     * Effects: Creates an empty student list.
     */
    public MagicClassroom() {
        students = new ArrayList<>();
    }

    /**
     * Adds a student to the classroom
     * @param student The student to add.
     * Effects: Adds student to the list if not null.
     */
    public void addStudent(HogwartsStudent student) {
        if (student != null) {
            students.add(student);
        }
    }

    /**
     * Finds a student by name.
     * @param name The student's name to search.
     * @return The found student, or null if not found.
     * Effects: Returns the student matching the given name or null if not found.
     */
    public HogwartsStudent findStudent(String name) {
        for (HogwartsStudent student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    /**
     * Finds the first student who knows a spell.
     * @param spell The spell to search for.
     * @return The first student who knows the spell, or null if no student knows it
     * Effects: Returns the first student who has learned the spell or null if none found.
     */
    public HogwartsStudent findStudentBySpell(String spell) {
        for (HogwartsStudent student : students) {
            if (student.knowsSpell(spell)) {
                return student;
            }
        }
        return null;
    }

    /**
     * Retrieves all students belonging to a specific house.
     * @param house The house name. 
     * @return List of students in the specified house.
     * Effects: Returns a filtered list of students belonging to the house.
     */
    public List<HogwartsStudent> getStudentsByHouse(String house) {
        return students.stream()
                .filter(student -> student.getHouse().equalsIgnoreCase(house))
                .collect(Collectors.toList());
    }

    /**
     * Retrieves all students sorted by house.
     * @return A list of students sorted alphabetically by house.
     * Effects: Returns a sorted list of students by house name.
     */
    public List<HogwartsStudent> getStudentsSortedByHouse() {
        return students.stream()
                .sorted((s1, s2) -> s1.getHouse().compareToIgnoreCase(s2.getHouse()))
                .collect(Collectors.toList());
    }
}


