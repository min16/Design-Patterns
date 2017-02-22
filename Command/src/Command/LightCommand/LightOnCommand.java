package Command.LightCommand;

import Command.Command;
import Receiver.Light;

/**
 * Created by DevNewbie on 2017-02-22.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.on();
    }
    public void undo() {
        light.off();
    }
}
