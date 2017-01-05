
/**
 * Created by IlyaGutnikov on 05.01.2017.
 */
public class NoQuarterState implements State{

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {

        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

        System.out.println("You insert a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());

    }

    @Override
    public void ejectQuarter() {

        System.out.println("You haven't insert a quarter");
    }

    @Override
    public void turnCrank() {

        System.out.println("You turned without a quarter");
    }

    @Override
    public void dispence() {

        System.out.println("You need to pay first");
    }
}
