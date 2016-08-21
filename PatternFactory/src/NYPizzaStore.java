/**
 * Created by IlyaGutnikov on 21.08.2016.
 */
public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {

            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }

        return pizza;
    }
}
