package Command.FanCommand;

import Command.Command;
import Receiver.Fan;

/**
 * Created by DevNewbie on 2017-02-22.
 */
public class FanOffCommand implements Command{
    Fan fan;
    int prevspeed;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }
    public void execute() {
        prevspeed = fan.getSpeed();
        fan.off();
    }
    public void undo() {
        if (prevspeed == Fan.HIGH) {
            fan.high();
        }else if (prevspeed == Fan.MEDIUM) {
            fan.medium();
        }else if (prevspeed == Fan.LOW) {
            fan.low();
        }else if (prevspeed == Fan.OFF) {
            fan.off();
        }
    }
}
