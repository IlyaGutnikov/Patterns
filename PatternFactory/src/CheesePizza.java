/**
 * Created by IlyaGutnikov on 21.08.2016.
 */
public class CheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;



    public CheesePizza (PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {

        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();

    }
}
