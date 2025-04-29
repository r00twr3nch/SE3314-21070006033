package org.example;
import java.util.List;

public class TaskManager {

    private NotificationService notificationService;

    // Constructor that takes NotificationService
    public TaskManager(NotificationService notificationService) {
        if (notificationService == null) {
            throw new IllegalArgumentException("NotificationService cannot be null");
        }
        this.notificationService = notificationService;
    }

    // Method to assign a task to a user
    public void assignTask(User user, Task task) {
        if (user == null || task == null) {
            throw new IllegalArgumentException("User and task cannot be null");
        }
        user.addTask(task);
        notificationService.sendNotification(user, "New task assigned: " + task.getTitle());
    }

    // Method to remove a task from a user
    public void removeTask(User user, Task task) {
        if (user == null || task == null) {
            throw new IllegalArgumentException("User and task cannot be null");
        }
        user.removeTask(task);
        notificationService.sendNotification(user, "Task removed: " + task.getTitle());
    }

    // Method to list all tasks assigned to a specific user
    public List<Task> listTasks(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }
        return user.getTasks();
    }
}
