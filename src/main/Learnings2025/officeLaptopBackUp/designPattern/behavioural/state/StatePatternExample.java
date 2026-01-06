package designPattern.behavioural.state;

public class StatePatternExample {
    public static void main(String[] args) {
        Document document = new Document(new DraftState());

        // Render in Draft state
        document.render();

        // Publish to Moderation state
        document.publish();
        document.setState(new ModerationState());

        // Render in Moderation state
        document.render();

        // Publish to Published state
        document.publish();
        document.setState(new PublishedState());

        // Render in Published state
        document.render();

        // Try publishing again
        document.publish();
    }


}
