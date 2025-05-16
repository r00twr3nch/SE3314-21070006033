package org.example;

/** The Main class to run the Character Battle game. */
public class Main {

    private Main() {
        // Prevent instantiation of utility class
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    /** The initial health value assigned to the Archer character. */
    private static final int ARCHER_HEALTH = 100;

    /** The initial attack power assigned to the Archer character. */
    private static final int ARCHER_ATTACK_POWER = 20;

    /** The initial health value assigned to the Mage character. */
    private static final int MAGE_HEALTH = 80;

    /** The initial attack power assigned to the Mage character. */
    private static final int MAGE_ATTACK_POWER = 30;

    /** The initial health value assigned to the Warrior character. */
    private static final int WARRIOR_HEALTH = 120;

    /** The initial attack power assigned to the Warrior character. */
    private static final int WARRIOR_ATTACK_POWER = 25;


    /**
     * The entry point of the program.
     *
     * @param args the command line arguments.
     */
    public static void main(final String[] args) {
        Game game = new Game();

        // Create characters
        Character archer = new Archer("Archer", ARCHER_HEALTH, ARCHER_ATTACK_POWER);
        Character mage = new Mage("Mage", MAGE_HEALTH, MAGE_ATTACK_POWER);
        Character warrior = new Warrior("Warrior", WARRIOR_HEALTH, WARRIOR_ATTACK_POWER);

        // Add characters to the game
        game.addCharacter(archer);
        game.addCharacter(mage);
        game.addCharacter(warrior);

        // Start the game
        game.startGame();
    }
}
