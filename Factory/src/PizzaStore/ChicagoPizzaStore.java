package PizzaStore;

import Pizza.ChicagoStyleCheesePizza;
import Pizza.Pizza;

/**
 * Created by DevNewbie on 2017-02-15.
 */
public class ChicagoPizzaStroe extends PizzaStore {
    public Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else {
            return  null;
        }
    }
}
