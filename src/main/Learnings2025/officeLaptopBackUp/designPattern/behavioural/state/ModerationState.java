package designPattern.behavioural.state;

public class ModerationState implements DocumentState {
    @Override
    public void render() {
        System.out.println("Rendering document in Moderation state.");
    }

    @Override
    public void publish() {
        System.out.println("Publishing document from Moderation to Published state.");
    }

}
