The **State Pattern** is a behavioral design pattern that allows an object to change its behavior when its internal state changes. It encapsulates state-specific behavior into separate classes and delegates state-specific behavior to the current state object.

### Key Components:
1. **State Interface**: Defines the common behavior for all concrete states.
2. **Concrete States**: Implement the behavior associated with a particular state of the context.
3. **Context**: Maintains a reference to the current state and delegates state-specific behavior to the current state object.

### Example: Document Workflow
We will implement a document workflow system where a document can be in different states (e.g., Draft, Moderation, Published).

#### Step 1: Define the State Interface
```java
package designPattern.behavioural.State;

// State Interface
public interface DocumentState {
    void render();
    void publish();
}
```

#### Step 2: Create Concrete States
```java
package designPattern.behavioural.State;

// Concrete State: Draft
public class DraftState implements DocumentState {
    @Override
    public void render() {
        System.out.println("Rendering document in Draft state.");
    }

    @Override
    public void publish() {
        System.out.println("Document moved to Moderation state.");
    }
}
```

```java
package designPattern.behavioural.State;

// Concrete State: Moderation
public class ModerationState implements DocumentState {
    @Override
    public void render() {
        System.out.println("Rendering document in Moderation state.");
    }

    @Override
    public void publish() {
        System.out.println("Document moved to Published state.");
    }
}
```

```java
package designPattern.behavioural.State;

// Concrete State: Published
public class PublishedState implements DocumentState {
    @Override
    public void render() {
        System.out.println("Rendering document in Published state.");
    }

    @Override
    public void publish() {
        System.out.println("Document is already in Published state.");
    }
}
```

#### Step 3: Create the Context Class
```java
package designPattern.behavioural.State;

// Context
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
```

#### Step 4: Client Code
```java
package designPattern.behavioural.State;

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
```

### Output:
```
Rendering document in Draft state.
Document moved to Moderation state.
Rendering document in Moderation state.
Document moved to Published state.
Rendering document in Published state.
Document is already in Published state.
```

### Explanation:
- The `DocumentState` interface defines the common behavior for all states.
- `DraftState`, `ModerationState`, and `PublishedState` implement state-specific behavior.
- The `Document` class (context) delegates behavior to the current state and allows state transitions.