public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");

        System.out.println("Pizza name " + pizza.getName());
    }
}
