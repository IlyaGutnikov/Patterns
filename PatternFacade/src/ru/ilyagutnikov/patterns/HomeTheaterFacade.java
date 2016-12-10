package ru.ilyagutnikov.patterns;

import ru.ilyagutnikov.patterns.Devices.Amplifier;
import ru.ilyagutnikov.patterns.Devices.DvdPlayer;
import ru.ilyagutnikov.patterns.Devices.Screen;

/**
 * Created by IlyaGutnikov on 10.12.2016.
 */
public class HomeTheaterFacade {

    Amplifier amp;
    DvdPlayer dvdPlayer;
    Screen screen;

    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvdPlayer, Screen screen) {

        this.amp = amp;
        this.dvdPlayer = dvdPlayer;
        this.screen = screen;

    }

    public void watchMovie() {


        amp.on();
        dvdPlayer.on();
        screen.on();
    }

    public void endMovie() {

        amp.off();
        dvdPlayer.off();
        screen.off();
    }
}
