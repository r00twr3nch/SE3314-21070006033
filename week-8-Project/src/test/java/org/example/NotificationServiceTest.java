package org.example;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class NotificationServiceTest {

    @Test
    public void testSendNotification_storesMessage() {
        NotificationService ns = new NotificationService();
        User user = new User("tom", "tom@mail.com");

        ns.sendNotification(user, "New task assigned");
        List<String> notifications = ns.getNotifications(user);

        assertEquals(1, notifications.size());
        assertEquals("New task assigned", notifications.get(0));
    }

    @Test
    public void testGetNotifications_emptyIfNone() {
        NotificationService ns = new NotificationService();
        User user = new User("anna", "anna@mail.com");

        List<String> notifications = ns.getNotifications(user);
        assertTrue(notifications.isEmpty());
    }
}
