package designPattern.structural.facade.implementation;

public class DVDPlayer {
    public void on() {
        System.out.println("DVD Player is ON");
    }

    public void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void stop() {
        System.out.println("Stopping DVD Player");
    }

    public void off() {
        System.out.println("DVD Player is OFF");
    }
}
