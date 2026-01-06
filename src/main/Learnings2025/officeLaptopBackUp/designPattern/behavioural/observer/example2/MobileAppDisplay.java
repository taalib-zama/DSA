package designPattern.behavioural.observer.example2;

public class MobileAppDisplay implements Observer {
    public void update(float t, float h, float p) {
        System.out.println("Mobile App: Temp=" + t + " Humidity=" + h + " Pressure=" + p);
    }
}
