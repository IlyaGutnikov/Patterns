package ru.ilyagutnikov.patterns;

import ru.ilyagutnikov.patterns.Adapter.GooseAdapter;
import ru.ilyagutnikov.patterns.Composite.Flock;
import ru.ilyagutnikov.patterns.Decorator.QuackCounter;
import ru.ilyagutnikov.patterns.Duck.*;
import ru.ilyagutnikov.patterns.Factory.AbstaractDuckFactory;
import ru.ilyagutnikov.patterns.Factory.CountingDuckFactory;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main duckSim = new Main();

        AbstaractDuckFactory duckFactory = new CountingDuckFactory();

        duckSim.simulate(duckFactory);

        //duckSim.simulate();
    }


    void simulate(AbstaractDuckFactory duckFactory) {

        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall =  duckFactory.createDuckCall();
        Quackable goose = new GooseAdapter(new Goose());

        Quackable mallardDuck2 = new QuackCounter(new MallardDuck());

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(goose);
        simulate(mallardDuck2);

        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);

        simulate(flockOfDucks);


        System.out.println("The duacks quacked " + QuackCounter.getNumberOfQuacks());
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
