package org.example;
import java.time.LocalDate;
public class Task {
    private String title;
    private LocalDate dueDate;
    private boolean isCompleted;

    public Task(String title, LocalDate dueDate) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        if (dueDate == null) {
            throw new IllegalArgumentException("Due date cannot be null");
        }
        this.title = title;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }
    // Getter methods
    public String getTitle() {
        return title;
    }
    public LocalDate getDueDate() {
        return dueDate;
    }
    public boolean isCompleted() {
        return isCompleted;
    }
    // Mark task as completed
    public void markCompleted() {
        this.isCompleted = true;
    }
    // Check if the task is overdue
    public boolean isOverdue() {
        return LocalDate.now().isAfter(dueDate);
    }
}
