package designPattern.structural.facade.implementation.facadeClasses;

import designPattern.structural.facade.implementation.Amplifier;
import designPattern.structural.facade.implementation.DVDPlayer;
import designPattern.structural.facade.implementation.Projector;

public class Main {
    public static void main(String[] args) {

            Amplifier amplifier = new Amplifier();
            DVDPlayer dvdPlayer = new DVDPlayer();
            Projector projector = new Projector();

            HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, dvdPlayer, projector);

            homeTheater.watchMovie("Inception");
            homeTheater.endMovie();
        }
}
