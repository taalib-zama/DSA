package designPattern.behavioural.command;

public class InvokerRemoteControl {
    private CommandInterface command;

    public InvokerRemoteControl() {

    }

    public void setCommand(CommandInterface command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

    public void pressUndo() {
        command.undo();
    }

}
