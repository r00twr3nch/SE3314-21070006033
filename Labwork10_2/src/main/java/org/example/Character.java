package org.example;

/**
 * The Character class represents a basic character in the battle.
 * This class provides common functionality for all character types.
 */
public class Character {

    /** The default attack power used when no specific value is provided. */
    private static final int DEFAULT_ATTACK_POWER = 10;

    /** The character's name.*/
    private String characterName;

    /** The character's health points.*/
    private int characterHealth;

    /** The character's attack power.*/
    private int characterAttackPower;

    /**
     * Constructs a Character object with specified name, health, and attack power.
     *
     * @param name the name of the character.
     * @param health the health points of the character.
     * @param attackPower the attack power of the character.
     */
    public Character(final String name, final int health, final int attackPower) {
        this.characterName = name;
        this.characterHealth = health;
        this.characterAttackPower = attackPower;
    }

    /**
     * Gets the name of the character.
     *
     * @return the character's name.
     */
    public String getCharacterName() {
        return characterName;
    }

    /**
     * Gets the health of the character.
     *
     * @return the character's health.
     */
    public int getCharacterHealth() {
        return characterHealth;
    }

    /**
     * Gets the attack power of the character.
     *
     * @return the character's attack power.
     */
    public int getCharacterAttackPower() {
        return characterAttackPower;
    }

    /**
     * Takes damage from an opponent and reduces health.
     *
     * @param damage the amount of damage to be taken.
     */
    public void takeDamage(final int damage) {
        this.characterHealth -= damage;
    }

    /**
     * Checks if the character is defeated.
     *
     * @return true if the character's health is less than or equal to 0, false otherwise.
     */
    public boolean isDefeated() {
        return this.characterHealth <= 0;
    }
}
