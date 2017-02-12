package Display;

import Interface.Observer;
import Interface.Subject;

/**
 * Created by minji on 17. 2. 12.
 */
public class CurrentConditionsDisplay implements Observer {

    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
    public void display(){
        System.out.println("current conditions: " + temp + "F degrees and " + humidity + "% humidity");
    }
}
