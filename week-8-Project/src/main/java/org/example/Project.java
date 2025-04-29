package org.example;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private List<User> users;
    private List<Task> tasks;

    public Project(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Project name cannot be null or empty");
        }
        this.name = name;
        this.users = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<User> getUsers() {
        return new ArrayList<>(users);
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }

    public void addUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }
        users.add(user);
    }

    public void addTask(Task task) {
        if (task == null) {
            throw new IllegalArgumentException("Task cannot be null");
        }
        tasks.add(task);
    }

    public Task getTaskByTitle(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                return task;
            }
        }
        return null;
    }
}
