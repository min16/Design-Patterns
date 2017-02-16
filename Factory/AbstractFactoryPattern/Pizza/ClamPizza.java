package Pizza;

import PizzaIngredient.Cheeses.Cheese;
import PizzaIngredient.Clams.Clams;
import PizzaIngredient.Dough.Dough;
import PizzaIngredientFactory.PizzaIngredientFactory;

/**
 * Created by DevNewbie on 2017-02-16.
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    public void prepare() {
        System.out.println("preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClams();
    }
}
