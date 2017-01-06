package ru.ilyagutnikov.patterns;

import java.io.Serializable;

/**
 * Created by IlyaGutnikov on 05.01.2017.
 */
public interface State extends Serializable {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispence();
}
