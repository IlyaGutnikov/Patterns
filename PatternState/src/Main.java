public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(200);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
    }
}
