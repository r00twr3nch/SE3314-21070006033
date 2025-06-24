package org.example;

/**
 * Represents a character in Middle-Earth.
 */
public class Character {
    private String name;
    private String race;
    private int age;

    /**
     * Constructor for Character.
     * @param name Character's name.
     * @param race Character's race.
     * @param age Character's age.
     */
    public Character(String name, String race, int age) {
        this.name = name;
        this.race = race;
        this.age = age;
    }

    /**
     * Prints character details.
     */
    public void printDetails() {
        if ("Hobbit".equals(race)) {
            System.out.println("Character is a Hobbit");
        } else if (age >= 50) {
            System.out.println("Character is 50 or older");
        } else if ("Frodo".equals(name)) {
            System.out.println("Character is Frodo");
        }
    }
}
