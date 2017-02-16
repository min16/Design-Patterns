package PizzaIngredientFactory;

import PizzaIngredient.Cheeses.Cheese;
import PizzaIngredient.Cheeses.ReggianoCheese;
import PizzaIngredient.Clams.Clams;
import PizzaIngredient.Clams.FreshClams;
import PizzaIngredient.Dough.Dough;
import PizzaIngredient.Dough.ThinCrustDough;

/**
 * Created by DevNewbie on 2017-02-16.
 */
public class NYIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Clams createClams() {
        return new FreshClams();
    }
}
