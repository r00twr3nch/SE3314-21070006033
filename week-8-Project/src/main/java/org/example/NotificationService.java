package org.example;
import java.util.*;

public class NotificationService {
    private Map<String, List<String>> notifications = new HashMap<>();

    public void sendNotification(User user, String message) {
        notifications.computeIfAbsent(user.getUsername(), k -> new ArrayList<>()).add(message);
    }

    public List<String> getNotifications(User user) {
        return notifications.getOrDefault(user.getUsername(), new ArrayList<>());
    }
}
