package ru.ilyagutnikov.patterns;


public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(200, "Moscow");

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
    }
}
