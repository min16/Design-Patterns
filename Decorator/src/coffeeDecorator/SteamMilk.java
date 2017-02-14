package coffeeDecorator;

import coffee.Beverage;

public class SteamMilk extends CondimentDecorator {
    Beverage beverage;

    public SteamMilk(Beverage beverage) {
      this.beverage = beverage;
    }

    public String getDescription() {
      return beverage.getDescription() + ", 스팀 밀크";
    }

    public double cost() {
      return .10 + beverage.cost();
    }
}
