package org.example;

/**The Archer class represents an Archer character that can perform special attacks. */
public class Archer extends Character {

    /** The damage value dealt by the Archer's special attack ability. */
    private static final int ARCHER_SPECIAL_ATTACK_DAMAGE = 20;

    /**
     * Constructs an Archer object with specified name, health, and attack power.
     *
     * @param name the name of the Archer.
     * @param health the health points of the Archer.
     * @param attackPower the attack power of the Archer.
     */
    public Archer(final String name, final int health, final int attackPower) {
        super(name, health, attackPower);
    }

    /**
     * Performs a special attack on an opponent.
     *
     * @param opponent the opponent to be attacked.
     */
    public void specialAttack(final Character opponent) {
        opponent.takeDamage(ARCHER_SPECIAL_ATTACK_DAMAGE);
    }
}
