package Receiver;

/**
 * Created by DevNewbie on 2017-02-22.
 */
public class Light {
    String description;

    public Light(String description){
        this.description = description;
    }

    public void on() {
        System.out.println(description + " is on");
    }
    public void off() {
        System.out.println(description + " is off");
    }
}
