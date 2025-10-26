package designPattern.creational.FactoryExample2.FactoryMethodPattern;

public class MainClass {
    public static void main(String[] args) {
        Notification notification =
                NotificationFactory.getNotification("SMS");
        notification.send("Hello, this is a test message!");

    }

}
