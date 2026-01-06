The Decorator Pattern is a structural design pattern that allows you to dynamically add new functionality to an object without altering its structure. It achieves this by wrapping the object in a series of decorator classes, each adding its own behavior.


Key Components:
Component: The interface or abstract class defining the methods that can be decorated.
Concrete Component: The base implementation of the Component interface.
Decorator: An abstract class implementing the Component interface and containing a reference to a Component object.
Concrete Decorators: Classes extending the Decorator class to add specific functionality.



Explanation:
The SimpleCoffee class is the base component.
The MilkDecorator and SugarDecorator dynamically add functionality (milk and sugar) to the coffee.
The client can combine decorators in any order to achieve the desired result.