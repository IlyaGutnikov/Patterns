/**
 * Created by IlyaGutnikov on 05.01.2017.
 */
public class HasQuarterState implements State {

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {

        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {

        System.out.println("Quarter refund");
        gumballMachine.setState(gumballMachine.getNoQuarterState());

    }

    @Override
    public void turnCrank() {

        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());

    }

    @Override
    public void dispence() {
        System.out.println("No gumball dispensed");
    }
}
