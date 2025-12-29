package designPattern.behavioural.observer.example2;

public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        MobileAppDisplay mobDisplay = new MobileAppDisplay();

        station.addObserver(mobDisplay);
        station.dataChanged(30.5f, 60.1f, 1009.2f);
    }
}
