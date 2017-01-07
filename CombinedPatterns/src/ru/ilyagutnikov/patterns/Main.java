package ru.ilyagutnikov.patterns;

import ru.ilyagutnikov.patterns.Adapter.GooseAdapter;
import ru.ilyagutnikov.patterns.Decorator.QuackCounter;
import ru.ilyagutnikov.patterns.Duck.*;

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
        Quackable goose = new GooseAdapter(new Goose());

        Quackable mallardDuck2 = new QuackCounter(new MallardDuck());

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(goose);
        simulate(mallardDuck2);

        System.out.println("The duacks quacked " + QuackCounter.getNumberOfQuacks());
    }

    void simulate(Quackable duck) {

        duck.quack();
    }
}
