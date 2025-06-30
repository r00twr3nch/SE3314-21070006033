package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; /**
 * Represents the master spellbook containing all known spells.
 */
public class Spellbook {
    private List<String> spells; 
    /**
     * Initializes an empty spellbook.
     * Effects: Creates an empty spell list.
     */
    public Spellbook() {
        spells = new ArrayList<>();
    }

    /** 
     * Adds a new spell to the spellbook.
     * @param spell The spell to add.
     * Effects: If spell is valid and unique, it is added to spells.
     */
    public void addSpell(String spell) {
        if (spell != null && !spell.isEmpty() && !spells.contains(spell)) {
            spells.add(spell);
        }
    }

    /**
     * Retrieves a spell by index.
     * @param index The index of the spell.
     * @return The spell at given index, or null if out of bounds.
     * Effects: Returns the spell at given index or null index is invalid.
     */
    public String getSpell(int index) {
        if (index < 0 || index >= spells.size()) {
            return null;
        }
        return spells.get(index);
    }

    /**
     * Retrieves all spells that start with a specific prefix.
     * @param prefix The prefix to filter spells.
     * @return A list of spells that start with the given prefix.
     * Effects: Returns all spells saved that match the given prefix.
     */
    public List<String> getSpellsByPrefix(String prefix) {
        return spells.stream()
                .filter(spell -> spell.startsWith(prefix))
                .collect(Collectors.toList());
    }
}
