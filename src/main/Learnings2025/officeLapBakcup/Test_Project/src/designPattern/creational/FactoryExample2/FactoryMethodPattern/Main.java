package designPattern.creational.FactoryExample2.FactoryMethodPattern;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Notification notification =
                NotificationFactory.getNotification("SMS");
        notification.send("Hello, this is a test message!");

    }

}
