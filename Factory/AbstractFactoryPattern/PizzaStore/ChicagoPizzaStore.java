package PizzaStore;

import Pizza.*;
import PizzaIngredientFactory.*;

/**
 * Created by DevNewbie on 2017-02-16.
 */
public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoIngredientFactory();
        Pizza pizza = null;

        if(item.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style cheese Pizza");
        }else if(item.equals("clams")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style clams Pizza");
        }
        return pizza;
    }
}
