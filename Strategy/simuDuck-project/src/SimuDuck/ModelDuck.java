package SimuDuck;

public class ModelDuck extends Duck {

  ModelDuck(){
    flyBehavior = new FlyNoWay();
    quackBehavior = new Squeak();
  }

  public void display(){
    System.out.println("I am model duck");
  }
}
