package PizzaStore;

import PizzaMenu.ChicagoStyleCheesePizza;
import PizzaMenu.Pizza;

/* Concrete Creator */
public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else {
            return  null;
        }
    }
}
