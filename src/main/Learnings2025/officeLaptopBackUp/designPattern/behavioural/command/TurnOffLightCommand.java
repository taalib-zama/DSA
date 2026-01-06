package designPattern.behavioural.command;

public class TurnOffLightCommand implements CommandInterface {
    private LightReceiver lightReceiver;

    public TurnOffLightCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.turnOff();
    }

    @Override
    public void undo() {
        lightReceiver.turnOn();
    }
}
