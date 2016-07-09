package ru.ilyagutnikov.patterns;

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
