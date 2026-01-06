package designPattern.behavioural.state;

public class DraftState implements DocumentState {
    @Override
    public void render() {
        System.out.println("Rendering document in Draft state.");
    }

    @Override
    public void publish() {
        System.out.println("Publishing document from Draft to Published state.");
    }
}
