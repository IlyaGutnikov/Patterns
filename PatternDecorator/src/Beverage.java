/**
 * Created by MartinSeptim on 24.07.2016.
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {

        return description;
    }

    public abstract double cost();
}
