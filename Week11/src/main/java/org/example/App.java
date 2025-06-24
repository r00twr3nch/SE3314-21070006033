package org.example;

/**
 * Entry point for the Middle-Earth simulation.
 */
public class App {
    public static void main(String[] args) {
        Character frodo = new Character("Frodo", "Hobbit", 50);
        frodo.printDetails();

        MiddleEarthMap map = new MiddleEarthMap();
        map.navigate("Mordor", true);

        Quest quest = new Quest();
        quest.completeQuest(100, true);
    }
}
