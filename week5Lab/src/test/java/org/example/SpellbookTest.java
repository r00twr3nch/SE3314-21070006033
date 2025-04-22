package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SpellbookTest {

    @Test
    void testGetSpellByValidIndex() {
        Spellbook spellbook = new Spellbook();
        spellbook.addSpell("Alohomora");
        assertEquals("Alohomora", spellbook.getSpell(0));
    }


    @Test
    void testGetSpellsByPrefix_ExactMatch() {
        Spellbook spellbook = new Spellbook();
        spellbook.addSpell("Alohomora");
        spellbook.addSpell("Accio");
        List<String> results = spellbook.getSpellsByPrefix("Alo");
        assertEquals(1, results.size());
    }

    @Test
    void testGetSpellsByPrefix_EmptyPrefix() {
        Spellbook spellbook = new Spellbook();
        spellbook.addSpell("Alohomora");
        assertEquals(1, spellbook.getSpellsByPrefix("").size());
    }

    @Test
    void testGetSpellsByPrefix_NoMatch() {
        Spellbook spellbook = new Spellbook();
        spellbook.addSpell("Lumos");
        List<String> results = spellbook.getSpellsByPrefix("XYZ");
        assertTrue(results.isEmpty());
    }
}