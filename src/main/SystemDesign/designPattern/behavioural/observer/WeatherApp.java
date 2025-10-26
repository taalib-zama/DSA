package designPattern.behavioural.observer;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        weatherData.registerObserver(currentDisplay);

        weatherData.setMeasurements(25.5f, 65, 1013.1f);
        weatherData.setMeasurements(26.0f, 70, 1012.5f);
    }
}
