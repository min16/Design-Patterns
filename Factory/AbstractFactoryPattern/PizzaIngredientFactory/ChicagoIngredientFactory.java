package PizzaIngredientFactory;

import PizzaIngredient.Cheeses.Cheese;
import PizzaIngredient.Cheeses.MozzarellaCheese;
import PizzaIngredient.Clams.Clams;
import PizzaIngredient.Clams.FrozenClams;
import PizzaIngredient.Dough.Dough;
import PizzaIngredient.Dough.ThickCrustDough;

/**
 * Created by DevNewbie on 2017-02-16.
 */
public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Clams createClams() {
        return new FrozenClams();
    }
}
