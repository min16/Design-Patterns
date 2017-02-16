package PizzaIngredientFactory;

import PizzaIngredient.Cheeses.Cheese;
import PizzaIngredient.Clams.Clams;
import PizzaIngredient.Dough.Dough;

/**
 * Created by DevNewbie on 2017-02-16.
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Cheese createCheese();
    Clams createClams();
}
