package Receiver;

/**
 * Created by DevNewbie on 2017-02-22.
 */
public class Door {
    String description;
    public Door (String description) {
        this.description = description;
    }

    public void open() {
        System.out.println(description + " is open");
    }
    public void close() {
        System.out.println(description + " is close");
    }
}
