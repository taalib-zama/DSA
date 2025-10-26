package designPattern.creational.FactoryExample2.FactoryMethodPattern;

public class NotificationFactory {
    public static Notification getNotification(String type) {
        if ("EMAIL".equalsIgnoreCase(type))
            return new EmailNotification();
        else if ("SMS".equalsIgnoreCase(type))
            return new SMSNotification();
        // Add more types as needed
        throw new IllegalArgumentException("Unknown notification type");
    }
}
