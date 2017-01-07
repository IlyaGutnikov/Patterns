package ru.ilyagutnikov.patterns;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main duckSim = new Main();
        duckSim.simulate();
    }

    void simulate() {

        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
    }

    void simulate(Quackable duck) {

        duck.quack();
    }
}
