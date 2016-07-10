package ru.ilyagutnikov.patterns;

/**
 * Паттерн Стратегия определяет семейчтво алгоритмов, инкапсулирует каждый из них и
 * обеспечивает их взаимозаменяемость. Он позволяет модифицировать алгоритмы независимо
 * от их использования на стороне клиента.
 */

public class Main {


    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();


        Duck model = new ModelDuck();
        //поменял на лету полет
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
