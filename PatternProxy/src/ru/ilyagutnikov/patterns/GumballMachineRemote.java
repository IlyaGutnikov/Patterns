package ru.ilyagutnikov.patterns;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by IlyaGutnikov on 06.01.2017.
 */
public interface GumballMachineRemote extends Remote {

    public int getCount() throws RemoteException;
    public String getLocation() throws  RemoteException;
    public  State getState() throws RemoteException;
}
