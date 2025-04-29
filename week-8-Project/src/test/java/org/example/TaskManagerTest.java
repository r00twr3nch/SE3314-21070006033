package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {

    private TaskManager taskManager;
    private NotificationService notificationService;
    private User user;
    private Task task;

    @BeforeEach
    void setUp() {
        notificationService = new NotificationService();
        taskManager = new TaskManager(notificationService);
        user = new User("john", "john@example.com");
        task = new Task("Complete the assignment", java.time.LocalDate.now());
    }

    @Test
    void testAssignTask() {
        /**
         Requires: user must be a non-null user object, task must be a non-null task object
         Effects: Adds the task to the user's task list, and sends a notification about the assigned task.
**/
        taskManager.assignTask(user, task);
        assertTrue(user.getTasks().contains(task), "User should have the assigned task.");
        assertEquals(1, notificationService.getNotifications(user).size(),
                "User should have received 1 notification.");
    }

    @Test
    void testRemoveTask() {
        /** Specification:,
          Requires: user must be a non-null user object, task must be a non-null task object
        Effects: Removes the task from the user's task list, and sends a notification about the task removal.
**/
        taskManager.assignTask(user, task);
        taskManager.removeTask(user, task);
        assertFalse(user.getTasks().contains(task), "User should not have the removed task.");
        assertEquals(2, notificationService.getNotifications(user).size(),
                "User should have received 2 notifications.");
    }

    @Test
    void testListTasks() {
        /** Specification:
        equires: user must be a non-null user object
        Effects: Returns the list of tasks assigned to the user.
**/
        taskManager.assignTask(user, task);

        assertEquals(1, taskManager.listTasks(user).size(), "User should have 1 task.");
        assertTrue(taskManager.listTasks(user).contains(task), "User's task list should contain the assigned task.");
    }

    @Test
    void testAssignTaskWithNullUser() {
        /** Specification:
        Requires: user must be a non-null user object
         Effects: Throws IllegalArgumentException if user is null.
**/
        assertThrows(IllegalArgumentException.class, () -> taskManager.assignTask(null, task),
                "Assigning a task to a null user should throw an IllegalArgumentException.");
    }

    @Test
    void testAssignTaskWithNullTask() {
        /** Specification:
        Requires: task must be a non-null task object
        Effects: Throws IllegalArgumentException if task is null.
**/
        assertThrows(IllegalArgumentException.class, () -> taskManager.assignTask(user, null),
                "Assigning a null task should throw an IllegalArgumentException.");
    }

    @Test
    void testRemoveTaskWithNullUser() {
        /** Specification:
        Requires: user must be a non-null user object
        Effects: Throws IllegalArgumentException if user is null.
**/
        assertThrows(IllegalArgumentException.class, () -> taskManager.removeTask(null, task),
                "Removing a task for a null user should throw an IllegalArgumentException.");
    }

    @Test
    void testRemoveTaskWithNullTask() {
        /** Specification:
        Requires: task must be a non-null task object
        Effects: Throws IllegalArgumentException if task is null.
**/
        assertThrows(IllegalArgumentException.class, () -> taskManager.removeTask(user, null),
                "Removing a null task should throw an IllegalArgumentException.");
    }
}
