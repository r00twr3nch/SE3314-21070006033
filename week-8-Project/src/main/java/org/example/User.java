package org.example;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private List<Task> tasks;
    public User(String username, String email) {
        if (username == null || email == null) {
            throw new IllegalArgumentException("Username or Email cannot be null or empty");
        }
        this.username = username;
        this.email = email;
        this.tasks = new ArrayList<>();
    }
    // Getter methods
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public List<Task> getTasks() {
        return tasks;
    }
    // Adds a task to the user's task list
    public void addTask(Task task) {
        tasks.add(task);
    }
    // Removes a task from the user's task list
    public void removeTask(Task task) {
        tasks.remove(task);
    }
    // Check if user has a specific task
    public boolean hasTask(Task task) {
        return tasks.contains(task);
    }
}
