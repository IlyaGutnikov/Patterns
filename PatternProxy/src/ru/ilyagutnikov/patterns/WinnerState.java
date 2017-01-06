package ru.ilyagutnikov.patterns;

/**
 * Created by IlyaGutnikov on 05.01.2017.
 */
public class WinnerState implements State {

    transient GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {

        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

        System.out.println("We already giving you a gumball");

    }

    @Override
    public void ejectQuarter() {

        System.out.println("You already turned the crank");
    }

    @Override
    public void turnCrank() {

        System.out.println("Turned twice doesn't get you another gumball");

    }

    @Override
    public void dispence() {

        System.out.println("WINNER, WINNER CHICKEN DINNER");
        gumballMachine.releaseBall();

        if (gumballMachine.getCount() == 0) {

            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {

            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {

                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {

                System.out.println("Out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

}
