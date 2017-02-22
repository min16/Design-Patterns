package Receiver;

/**
 * Created by DevNewbie on 2017-02-22.
 */
public class Fan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF =0;
    String description;
    int speed;

    public Fan(String description) {
        this.description = description;
        speed = OFF;
    }
    public void high() {
        speed = HIGH;
        System.out.println(description + "is on high");
    }
    public void medium() {
        speed = MEDIUM;
        System.out.println(description + "is on medium");
    }
    public void low() {
        speed = LOW;
        System.out.println(description + "is on low");
    }
    public void off() {
        speed = OFF;
        System.out.println(description + "is on off");
    }
    public int getSpeed() {
        return speed;
    }
}
