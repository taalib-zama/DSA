ns are design patterns in software development that focus on how classes and objects are composed to form larger structures. These patterns help ensure that components are organized in a way that reduces complexity and promotes flexibility and scalability.



They deal with the composition of classes or objects.
They simplify the structure by identifying relationships between entities.
They promote code reuse and flexibility in the system




Common Structural Design Patterns:
Adapter: Converts the interface of a class into another interface that a client expects. Used when two incompatible interfaces need to work together.  
Example: Connecting a legacy system to a modern application.
Bridge: Decouples an abstraction from its implementation, allowing them to vary independently.  
Example: Separating the abstraction of a shape (e.g., Circle) from its rendering logic (e.g., Vector or Raster).
Composite: Composes objects into tree structures to represent part-whole hierarchies. Allows clients to treat individual objects and compositions uniformly.  
Example: Representing a file system with files and directories.
Decorator: Adds new functionality to an object dynamically without altering its structure.  
Example: Adding scrollbars to a window in a GUI application.
Facade: Provides a simplified interface to a larger body of code, hiding the complexities of the subsystem.  
Example: A single API for interacting with a complex library.
Flyweight: Reduces memory usage by sharing common parts of objects instead of creating new ones.  
Example: Managing a large number of graphical objects like characters in a text editor.
Proxy: Provides a placeholder or surrogate to control access to another object.  
Example: Lazy initialization, access control, or logging.
Where They Are Used:
Enterprise Applications: To manage complex systems with multiple subsystems.
GUI Applications: For creating reusable and flexible user interface components.
Game Development: To optimize memory usage and manage object hierarchies.
Middleware and Frameworks: To provide simplified interfaces for developers.
Legacy System Integration: To adapt old systems to work with modern interfaces.