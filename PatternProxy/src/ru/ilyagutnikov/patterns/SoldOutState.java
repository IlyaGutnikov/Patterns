package ru.ilyagutnikov.patterns;

/**
 * Created by IlyaGutnikov on 05.01.2017.
 */
public class SoldOutState implements State {

    transient GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {

        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("All gumballs are sold");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Insert coin first");

    }

    @Override
    public void turnCrank() {
        System.out.println("No gumballs");
    }

    @Override
    public void dispence() {
        System.out.println("No gumballs");
    }
}
