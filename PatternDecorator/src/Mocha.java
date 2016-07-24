/**
 * Created by MartinSeptim on 24.07.2016.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {

        this.beverage = beverage;
    }

    public String getDescription() {

        return  beverage.getDescription() + ", Mocha";
    }


    public double cost() {

        return 0.20 + beverage.cost();
    }
}
