package org.example;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    public void testIsOverdue_trueIfPastDueDate() {
        Task task = new Task("Submit report", LocalDate.now().minusDays(1));
        assertTrue(task.isOverdue());
    }

    @Test
    public void testIsOverdue_falseIfNotOverdue() {
        Task task = new Task("Do homework", LocalDate.now().plusDays(3));
        assertFalse(task.isOverdue());
    }

    @Test
    public void testMarkCompleted_setsStatusToTrue() {
        Task task = new Task("Review PR", LocalDate.now());
        task.markCompleted();
        assertTrue(task.isCompleted());
    }

    @Test
    public void testTitleNotNull() {
        assertThrows(IllegalArgumentException.class, () -> new Task(null, LocalDate.now()));
    }

    @Test
    public void testDueDateNotNull() {
        assertThrows(IllegalArgumentException.class, () -> new Task("Test", null));
    }
}