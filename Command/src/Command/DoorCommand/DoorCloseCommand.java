package Command.DoorCommand;

import Command.Command;
import Receiver.Door;

/**
 * Created by DevNewbie on 2017-02-22.
 */
public class DoorCloseCommand implements Command {
    Door door;

    public DoorCloseCommand(Door door) {
        this.door = door;
    }
    public void execute() {
        door.close();
    }
    public void undo() {
        door.open();
    }
}
