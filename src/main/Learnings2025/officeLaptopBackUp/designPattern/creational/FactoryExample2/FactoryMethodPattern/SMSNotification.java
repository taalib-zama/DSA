package designPattern.creational.FactoryExample2.FactoryMethodPattern;

public class SMSNotification  implements Notification {

    @Override
    public void send(String message) {
        System.out.println("logic for SMS triggered");
        // SMS gateway logic here
    }

}
