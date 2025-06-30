package org.example;

import java.util.Random; /**
 * Simulates a magical duel between two Hogwarts students.
 */
public class Duel {

    /**
     * Starts a duel between two students using a given spell.
     * @param s1    The first student. (Requires: s1 != null)
     * @param s2    The second student. (Requires: s2 != null)
     * @param spell The spell used in the duel.
     * Effects:
     * - If neither student knows the spell, the duel ends in a draw.
     * - If only one student knows the spell, that student wins.
     * - If both students know the spell, the winner is determined randomly.
     */
    public static void start(HogwartsStudent s1, HogwartsStudent s2, String spell) {
        if (s1 == null || s2 == null || spell == null || spell.isEmpty()) {
            throw new IllegalArgumentException("Invalid duel setup.");
        }

        boolean s1Knows = s1.knowsSpell(spell);
        boolean s2Knows = s2.knowsSpell(spell);

        if (!s1Knows && !s2Knows) {
            System.out.println("It's a draw! Neither wizard knows " + spell);
        } else if (s1Knows && !s2Knows) {
            System.out.println(s1.getName() + " wins! " + s2.getName() + " doesn't know " + spell);
        } else if (!s1Knows && s2Knows) {
            System.out.println(s2.getName() + " wins! " + s1.getName() + " doesn't know " + spell);
        } else {
            Random rand = new Random();
            if (rand.nextBoolean()) {
                System.out.println(s1.getName() + " wins the duel!");
            } else {
                System.out.println(s2.getName() + " wins the duel!");
            }
        }
    }
}
