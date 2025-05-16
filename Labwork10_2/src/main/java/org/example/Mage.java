package org.example;

/** The Mage class represents a Mage character that can perform magic-based attacks. */
public class Mage extends Character {

    /** The special attack damage value for a Mage character. */
    private static final int MAGE_SPECIAL_ATTACK_DAMAGE = 50;

    /**
     * Constructs a Mage object with specified name, health, and attack power.
     *
     * @param name the name of the Mage.
     * @param health the health points of the Mage.
     * @param attackPower the attack power of the Mage.
     */
    public Mage(final String name, final int health, final int attackPower) {
        super(name, health, attackPower);
    }

    /**
     * Performs a special magic-based attack on an opponent.
     *
     * @param opponent the opponent to be attacked.
     */
    public void specialAttack(final Character opponent) {
        opponent.takeDamage(MAGE_SPECIAL_ATTACK_DAMAGE);
    }
}
