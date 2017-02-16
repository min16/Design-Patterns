package PizzaMenu;

/**
 * Created by DevNewbie on 2017-02-16.
 */
public abstract class Pizza {

    public abstract void prepare();

    public void bake() {
        System.out.println("baking");
    }

    public void cut() {
        System.out.println("cutting..");
    }

    public void box() {
        System.out.println("boxing");
    }
}
