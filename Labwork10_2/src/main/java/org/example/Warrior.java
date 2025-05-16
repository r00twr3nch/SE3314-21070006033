package org.example;

/** The Warrior class represents a Warrior character that can perform physical-based attacks. */
public class Warrior extends Character {

    /** The special attack damage value for a Warrior character.*/
    private static final int WARRIOR_SPECIAL_ATTACK_DAMAGE = 30;

    /**
     * Constructs a Warrior object with specified name, health, and attack power.
     *
     * @param name the name of the Warrior.
     * @param health the health points of the Warrior.
     * @param attackPower the attack power of the Warrior.
     */
    public Warrior(final String name, final int health, final int attackPower) {
        super(name, health, attackPower);
    }

    /**
     * Performs a special physical attack on an opponent.
     *
     * @param opponent the opponent to be attacked.
     */
    public void specialAttack(final Character opponent) {
        opponent.takeDamage(WARRIOR_SPECIAL_ATTACK_DAMAGE);
    }
}
