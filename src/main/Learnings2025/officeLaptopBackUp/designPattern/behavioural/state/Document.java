package designPattern.behavioural.state;

public class Document {
    private DocumentState state;

    public Document(DocumentState state) {
        this.state = state;
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void render() {
        state.render();
    }

    public void publish() {
        state.publish();
    }
}
