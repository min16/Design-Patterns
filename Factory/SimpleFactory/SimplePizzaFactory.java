import PizzaMenu.CheesePizza;
import PizzaMenu.Pizza;
import PizzaMenu.VeggiPizza;

/**
 * Created by DevNewbie on 2017-02-16.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) {
            return new CheesePizza();
        }else if(type.equals("veggi")) {
            return new VeggiPizza();
        }else {
            return null;
        }
    }
}
