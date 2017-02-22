package Command.DoorCommand;

import Command.Command;
import Receiver.Door;

/**
 * Created by DevNewbie on 2017-02-22.
 */
public class DoorOpenCommand implements Command {
    Door door;

    public DoorOpenCommand(Door door) {
        this.door = door;
    }
    public void execute() {
        door.open();
    }
    public void undo() {
        door.close();
    }
}
