/**
 * Created by IlyaGutnikov on 05.01.2017.
 */

package ru.ilyagutnikov.patterns;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    String location;

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state;
    int count = 0;

    public GumballMachine(int numberOfGumballs, String location) throws RemoteException {

        count = numberOfGumballs;

        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        state = noQuarterState;

        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public State getState() {
        return state;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispence();
    }

    void setState(State state) {

        this.state = state;
    }

    void releaseBall() {

        System.out.println("A gumball comes rolling out the slot");
        if (count != 0) {
            count = count -1;
        }
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public int getCount() {
        return count;
    }
}
