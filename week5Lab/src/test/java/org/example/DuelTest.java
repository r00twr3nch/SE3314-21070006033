package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DuelTest {

    @Test
    void testDuelBothKnowSpell() {
        HogwartsStudent s1 = new HogwartsStudent("Harry", "Gryffindor", 5);
        HogwartsStudent s2 = new HogwartsStudent("Draco", "Slytherin", 5);
        s1.learnSpell("Expelliarmus");
        s2.learnSpell("Expelliarmus");

        assertDoesNotThrow(() -> Duel.start(s1, s2, "Expelliarmus"));
    }

    @Test
    void testDuelOnlyOneKnowsSpell() {
        HogwartsStudent s1 = new HogwartsStudent("Harry", "Gryffindor", 5);
        HogwartsStudent s2 = new HogwartsStudent("Crabbe", "Slytherin", 5);
        s1.learnSpell("Lumos");

        assertDoesNotThrow(() -> Duel.start(s1, s2, "Lumos"));
    }

    @Test
    void testDuelNeitherKnowsSpell() {
        HogwartsStudent s1 = new HogwartsStudent("Harry", "Gryffindor", 5);
        HogwartsStudent s2 = new HogwartsStudent("Crabbe", "Slytherin", 5);

        assertDoesNotThrow(() -> Duel.start(s1, s2, "Avada Kedavra"));
    }

    @Test
    void testDuelWithNullStudent() {
        HogwartsStudent harry = new HogwartsStudent("Harry", "Gryffindor", 5);
        harry.learnSpell("Lumos");

        assertThrows(IllegalArgumentException.class, () -> {
            Duel.start(harry, null, "Lumos");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            Duel.start(null, harry, "Lumos");
        });
    }
}
