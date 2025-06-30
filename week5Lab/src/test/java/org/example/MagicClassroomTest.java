package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MagicClassroomTest {

    @Test
    void testAddValidStudent() {
        MagicClassroom classroom = new MagicClassroom();
        HogwartsStudent student = new HogwartsStudent("Luna", "Ravenclaw", 4);
        classroom.addStudent(student);
        assertEquals(student, classroom.findStudent("Luna"));
    }

    @Test
    void testAddNullStudent() {
        MagicClassroom classroom = new MagicClassroom();
        classroom.addStudent(null);
        assertNull(classroom.findStudent("Nobody"));
    }

    @Test
    void testFindStudentBySpell() {
        MagicClassroom classroom = new MagicClassroom();
        HogwartsStudent harry = new HogwartsStudent("Harry", "Gryffindor", 5);
        harry.learnSpell("Expelliarmus");
        classroom.addStudent(harry);
        assertEquals(harry, classroom.findStudentBySpell("Expelliarmus"));
    }

    @Test
    void testGetStudentsByHouse() {
        MagicClassroom classroom = new MagicClassroom();
        classroom.addStudent(new HogwartsStudent("Draco", "Slytherin", 5));
        classroom.addStudent(new HogwartsStudent("Pansy", "Slytherin", 5));
        assertEquals(2, classroom.getStudentsByHouse("Slytherin").size());
    }

    @Test
    void testGetStudentsSortedByHouse() {
        MagicClassroom classroom = new MagicClassroom();
        classroom.addStudent(new HogwartsStudent("Cedric", "Hufflepuff", 6));
        classroom.addStudent(new HogwartsStudent("Cho", "Ravenclaw", 6));
        assertEquals("Cedric", classroom.getStudentsSortedByHouse().get(0).getName());
    }
}
