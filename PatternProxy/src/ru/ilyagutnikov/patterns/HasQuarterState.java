package ru.ilyagutnikov.patterns;

import java.util.Random;

/**
 * Created by IlyaGutnikov on 05.01.2017.
 */
public class HasQuarterState implements State {

    GumballMachine gumballMachine;
    Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {

        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {

        System.out.println("Quarter refund");
        gumballMachine.setState(gumballMachine.getNoQuarterState());

    }

    @Override
    public void turnCrank() {

        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        }
        else{

            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispence() {
        System.out.println("No gumball dispensed");
    }
}
