package PizzaStore;

import PizzaMenu.Pizza;
import PizzaMenu.NYStyleCheesePizza;

/* Concrete Creator */
public class NYPizzaStore extends PizzaStore{
    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        }else
            return null;
    }
}
