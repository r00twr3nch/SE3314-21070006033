package org.example;

import java.util.ArrayList;
import java.util.List;

public class Quest {
    public String name;
    private String difficulty;
    private Mentor mentor;
    private List<Adventurer> adventurers;

    public Quest(String name, String difficulty, Mentor mentor) {
        this.name = name;
        this.difficulty = difficulty;
        this.mentor = mentor;
        this.adventurers = new ArrayList<>();
    }

    public void addAdventurer(Adventurer adventurer) {
        adventurers.add(adventurer);
    }

    public List<Adventurer> getAdventurers() {
        return adventurers;
    }
}
