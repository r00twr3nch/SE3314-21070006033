package org.example;

// Character.java (Superclass for Adventurer and Mentor)
public abstract class Character {
    protected String name;
    protected String title;

    public Character(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }
}
