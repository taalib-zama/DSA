The Observer design pattern is a behavioral design pattern that establishes a one-to-many dependency between 
objects so that when one object (the subject) changes state, all its dependent objects (observers) are notified and
updated automatically. This pattern promotes loose coupling by allowing subjects and observers to interact through abstract interfaces.



Core Concepts
**Subject**: Maintains a list of observers and provides methods to attach, detach, and notify observers about state changes.

**Observer**: Defines an interface with an update method to receive notifications.

**ConcreteSubject**: A specific implementation of the subject that holds the state and notifies observers when the state changes.

**ConcreteObserver**: Implements the observer interface to react to state changes from the subject.

Ex :Imagine a weather station that updates multiple smart devices or apps when weather data changes.



Why Observer Pattern in Production?
Loose coupling: Add, remove, or modify observers independently of the subject.

Real-time notification: Supports asynchronous, dynamic event updates to many listeners.

Scalability: Easily extend to more observers (new components, new device types).

Maintainability: No need to change Subject logic when observers change.

The Observer pattern is widely used in production systems for stock tickers, chat apps, real-time notifications, monitoring dashboards, and event tracking, enabling robust, scalable, and flexible communication architectures