package org.example;

import java.util.ArrayList;
import java.util.List;

/** The Game class manages the characters and game flow. */
public class Game {

    /** A list of all characters participating in the game. */
    private List<Character> characters;

    /** Constructs a Game object. */
    public Game() {
        this.characters = new ArrayList<>();
    }

    /**
     * Adds a character to the game.
     *
     * @param character the character to be added to the game.
     */
    public void addCharacter(final Character character) {
        characters.add(character);
    }

    /** Starts the game and manages the battle.*/
    public void startGame() {
        // Implement game start logic, like initializing the battle.
    }
}
