public class Main {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey says...");
        turkey.fly();
        turkey.gouble();

        System.out.println("\nDuck says...");
        TestDuck(duck);

        System.out.println("\nTurkey adapter says...");
        TestDuck(turkeyAdapter);
    }

    static void TestDuck(Duck duck) {

        duck.fly();
        duck.quack();
    }
}
