package PizzaStore;

import Pizza.*;
import PizzaIngredient.Clams.FreshClams;
import PizzaIngredientFactory.*;

/**
 * Created by DevNewbie on 2017-02-16.
 */
public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        PizzaIngredientFactory pizzaIngredientFactory = new NYIngredientFactory();
        Pizza pizza = null;

        if(item.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New york Style cheese Pizza");
        }else if(item.equals("clams")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New york Style clams Pizza");
        }
        return pizza;
    }
}
