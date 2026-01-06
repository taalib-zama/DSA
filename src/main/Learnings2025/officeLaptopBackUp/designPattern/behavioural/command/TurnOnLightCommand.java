package designPattern.behavioural.command;

public class TurnOnLightCommand implements CommandInterface {
    private LightReceiver lightReceiver;

    public TurnOnLightCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        lightReceiver.turnOn();
    }

    @Override
    public void undo() {
        lightReceiver.turnOff();
    }
}
