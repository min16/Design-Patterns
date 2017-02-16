package PizzaStore;

import Pizza.Pizza;

/**
 * Created by DevNewbie on 2017-02-16.
 */
public abstract class PizzaStore {

    public void orderPizza(String item) {
        Pizza pizza = createPizza(item);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
    protected abstract Pizza createPizza(String item);
}
