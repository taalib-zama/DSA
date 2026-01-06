package designPattern.behavioural.state;

public class PublishedState implements DocumentState {
    @Override
    public void render() {
        System.out.println("Rendering document in Published state.");
    }

    @Override
    public void publish() {
        System.out.println("Document is already published.");
    }
}
