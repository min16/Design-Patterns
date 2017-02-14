package coffee;

public abstract class Beverage {
  public String description;
  public abstract double cost();
  public String getDescription() {
    return description;
  }
}
