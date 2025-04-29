package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testAddTask_taskIsAdded() {
        User user = new User("alice", "alice@example.com");
        Task task = new Task("Read book", java.time.LocalDate.now());
        user.addTask(task);
        assertTrue(user.getTasks().contains(task));
    }

    @Test
    public void testHasTask_trueIfTaskPresent() {
        User user = new User("bob", "bob@example.com");
        Task task = new Task("Write code", java.time.LocalDate.now());
        user.addTask(task);
        assertTrue(user.hasTask(task));
    }

    @Test
    public void testHasTask_falseIfTaskNotPresent() {
        User user = new User("bob", "bob@example.com");
        Task task = new Task("Write code", java.time.LocalDate.now());
        assertFalse(user.hasTask(task));
    }

    @Test
    public void testUsernameOrEmailCannotBeNull() {
        assertThrows(IllegalArgumentException.class, () -> new User(null, "mail"));
        assertThrows(IllegalArgumentException.class, () -> new User("name", null));
    }
}
