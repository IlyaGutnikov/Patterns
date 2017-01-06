package ru.ilyagutnikov.patterns;

import java.rmi.RemoteException;

/**
 * Created by IlyaGutnikov on 06.01.2017.
 */
public class GumballMonitor {

    GumballMachineRemote machine;

    public  GumballMonitor(GumballMachineRemote machine) {

        this.machine = machine;
    }

    public void report() {

        try {

            System.out.println("Gumball machine " + machine.getLocation());
            System.out.println("Current inventory " + machine.getCount());
            System.out.println("Current state " + machine.getState());
        } catch (RemoteException e) {

            e.printStackTrace();
        }
    }

}
