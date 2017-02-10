package SimuDuck;


public class MallardDuck extends Duck {

  MallardDuck(){
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  public void display(){
    System.out.println("I am mallard duck");
  }
}
