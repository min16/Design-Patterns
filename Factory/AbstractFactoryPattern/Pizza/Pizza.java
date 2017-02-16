package Pizza;

import PizzaIngredient.Cheeses.Cheese;
import PizzaIngredient.Clams.Clams;
import PizzaIngredient.Dough.Dough;


import java.util.ArrayList;

/**
 * Created by DevNewbie on 2017-02-16.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Cheese cheese;
    Clams clams;
    ArrayList toppings = new ArrayList();

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore.PizzaStore box\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
