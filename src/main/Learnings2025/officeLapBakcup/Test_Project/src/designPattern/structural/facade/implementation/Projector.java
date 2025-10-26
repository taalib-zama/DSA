package designPattern.structural.facade.implementation;

public class Projector {
    public void on() {
        System.out.println("Projector is ON");
    }
    public void wideScreenMode() {
        System.out.println("Projector in widescreen mode");
    }

    public void off() {
        System.out.println("Projector is OFF");
    }
}
