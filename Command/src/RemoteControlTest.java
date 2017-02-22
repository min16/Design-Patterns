import Command.DoorCommand.DoorCloseCommand;
import Command.DoorCommand.DoorOpenCommand;
import Command.FanCommand.FanHighCommand;
import Command.FanCommand.FanLowCommand;
import Command.FanCommand.FanMediumCommand;
import Command.FanCommand.FanOffCommand;
import Command.LightCommand.LightOffCommand;
import Command.LightCommand.LightOnCommand;
import Receiver.Door;
import Receiver.Fan;
import Receiver.Light;

/**
 * Created by DevNewbie on 2017-02-22.
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light livingRoomLight = new Light("living room light");
        Light kitchenLight = new Light("kitchen light");
        Door garageDoor = new Door("garage door");
        Fan livingRoomFan = new Fan("living room fan");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        DoorOpenCommand garageDoorOpen = new DoorOpenCommand(garageDoor);
        DoorCloseCommand garageDoorClose = new DoorCloseCommand(garageDoor);

        FanHighCommand fanHighCommand = new FanHighCommand(livingRoomFan);
        FanMediumCommand fanMediumCommand = new FanMediumCommand(livingRoomFan);
        FanLowCommand fanLowCommand = new FanLowCommand(livingRoomFan);
        FanOffCommand fanOffCommand = new FanOffCommand(livingRoomFan);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, garageDoorOpen, garageDoorClose);
        remote.setCommand(3, fanHighCommand, fanOffCommand);
        remote.setCommand(4, fanMediumCommand, fanOffCommand);
        remote.setCommand(5, fanLowCommand, fanOffCommand);

        remote.onButtonWasPressed(0);
        remote.offButtonWasPressed(0);
        System.out.println(remote);

        remote.undoButtonWasPressed();

        remote.onButtonWasPressed(1);
        remote.offButtonWasPressed(1);
        remote.onButtonWasPressed(2);
        remote.offButtonWasPressed(2);
        System.out.println(remote);

        remote.undoButtonWasPressed();

        remote.onButtonWasPressed(3);
        remote.offButtonWasPressed(3);
        System.out.println(remote);

        remote.undoButtonWasPressed();

        remote.onButtonWasPressed(4);
        System.out.println(remote);

        remote.undoButtonWasPressed();

    }
}

