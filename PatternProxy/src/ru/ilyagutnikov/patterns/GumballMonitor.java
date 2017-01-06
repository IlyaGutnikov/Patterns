package ru.ilyagutnikov.patterns;

/**
 * Created by IlyaGutnikov on 06.01.2017.
 */
public class GumballMonitor {

    GumballMachine machine;

    public  GumballMonitor(GumballMachine machine) {

        this.machine = machine;
    }

    public void report() {

        System.out.println("Gumball machine " + machine.getLocation());
        System.out.println("Current inventory " + machine.getCount());
        System.out.println("Current state " + machine.getState());
    }

}
