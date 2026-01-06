package designPattern.behavioural.command;

public class CommandExample {
    public static void main(String[] args) {
        LightReceiver livingRoomLight = new LightReceiver();

        CommandInterface turnOnCommand = new TurnOnLightCommand(livingRoomLight);
        CommandInterface turnOffCommand = new TurnOffLightCommand(livingRoomLight);

        InvokerRemoteControl remote = new InvokerRemoteControl();

        // Turn the light on
        remote.setCommand(turnOnCommand);
        remote.pressButton();

        // Undo the operation
        remote.pressUndo();

        // Turn the light off
        remote.setCommand(turnOffCommand);
        remote.pressButton();

        // Undo the operation
        remote.pressUndo();

    }
}
