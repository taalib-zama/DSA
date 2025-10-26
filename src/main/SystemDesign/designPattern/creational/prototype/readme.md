The Prototype Design Pattern is a creational design pattern that allows you to create new objects by copying an existing object, 
known as the prototype. 
This pattern is particularly useful when object creation is costly (e.g., involves database operations or complex computations)
or when you want to avoid creating objects from scratch.

https://java-design-patterns.com/patterns/prototype/#also-known-as

Key Concepts:
Prototype Object: An existing object that serves as a template for creating new objects.
Cloning: New objects are created by copying the prototype object, typically using a clone() method.
Shallow Copy vs. Deep Copy:



Implementation in Java:
The Prototype pattern is often implemented using the Cloneable interface and the clone() method. 
