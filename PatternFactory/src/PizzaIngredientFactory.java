/**
 * Created by MartinSeptim on 21.08.2016.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Pepperoni createPepperoni();
    public Clams createClam();
    public Veggies[] createVeggies();
}
