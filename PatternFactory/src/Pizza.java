/**
 * Created by IlyaGutnikov on 21.08.2016.
 */
public abstract class Pizza {

    String name;
    Dough dough;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    Sauce sauce;

    abstract void prepare();

    void bake() {

        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cut in diagonal slices");
    }

    void setName(String name) {

        this.name = name;
    }

    String getName() {

        return name;
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String toString() {

        return "";
    }


}
