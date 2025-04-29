package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProjectTest {

    @Test
    public void testAddUser_userIsAdded() {
        Project project = new Project("Backend");
        User user = new User("carl", "carl@mail.com");
        project.addUser(user);
        assertTrue(project.getUsers().contains(user));
    }

    @Test
    public void testAddTask_taskIsAdded() {
        Project project = new Project("Mobile App");
        Task task = new Task("Fix bugs", java.time.LocalDate.now());
        project.addTask(task);
        assertTrue(project.getTasks().contains(task));
    }

    @Test
    public void testGetTaskByTitle_findsCorrectTask() {
        Project project = new Project("UI Revamp");
        Task task = new Task("Design login", java.time.LocalDate.now());
        project.addTask(task);
        assertEquals(task, project.getTaskByTitle("Design login"));
    }

    @Test
    public void testGetTaskByTitle_returnsNullIfNotFound() {
        Project project = new Project("DevOps");
        assertNull(project.getTaskByTitle("Nonexistent Task"));
    }
}
