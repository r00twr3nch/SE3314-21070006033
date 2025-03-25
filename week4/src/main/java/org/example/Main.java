package org.example;// Mentor.java (Mentor class extending Character)

// Adventurer.java (Adventurer class implementing Joinable)

// Quest.java (Quest class for tracking quests and adventurers)


// Main.java (Main application for testing)
public class Main {
    public static void main(String[] args) {
        Mentor gandalf = new Mentor("Gandalf", "The Grey");
        Mentor elrond = new Mentor("Elrond", "Lord of Rivendell");

        Adventurer frodo = new Adventurer("Frodo Baggins", "Ring Bearer", "Hobbit");
        Adventurer aragorn = new Adventurer("Aragorn", "King of Gondor", "Man");
        Adventurer legolas = new Adventurer("Legolas", "Prince of Mirkwood", "Elf");
        Adventurer gimli = new Adventurer("Gimli", "Son of Gloin", "Dwarf");

        Quest destroyRing = new Quest("Destroy the One Ring", "Extreme", gandalf);
        Quest defendHelmsDeep = new Quest("Defend Helm’s Deep", "Hard", elrond);

        frodo.joinQuest(destroyRing);
        aragorn.joinQuest(defendHelmsDeep);
        legolas.joinQuest(defendHelmsDeep);
        gimli.joinQuest(defendHelmsDeep);

        System.out.println("Quests Gimli is part of:");
        for (Quest quest : gimli.getQuests()) {
            System.out.println(quest.name);
        }
    }
}
