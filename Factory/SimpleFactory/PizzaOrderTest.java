/**
 * Created by DevNewbie on 2017-02-16.
 */
public class SimpleFactoryTest {
    public static void main(String[] args){
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("veggi");
    }
}
