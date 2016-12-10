package ru.ilyagutnikov.patterns;

import ru.ilyagutnikov.patterns.Devices.Amplifier;
import ru.ilyagutnikov.patterns.Devices.DvdPlayer;
import ru.ilyagutnikov.patterns.Devices.Screen;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Amplifier amp = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvdPlayer ,screen);

        homeTheater.watchMovie();

        homeTheater.endMovie();

    }
}
