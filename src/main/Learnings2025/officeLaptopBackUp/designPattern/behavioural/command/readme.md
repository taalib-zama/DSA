The Command Pattern is a behavioral design pattern that encapsulates a request as an object, allowing you to parameterize objects with different requests, delay execution, or support undoable operations. It decouples the sender (invoker) of a request from its receiver.  
Key Components:
- Command Interface: Declares the method to execute the command.
- Concrete Command: Implements the command interface and defines the binding between a receiver and an action.
- Receiver: The object that performs the actual work when the command is executed.
- Invoker: Stores and executes the command.
- Client: Creates and configures the commands and their receivers.



Ex : Let's consider a home automation system where commands are used to turn lights on and off.



The Command interface defines the execute and undo methods.
TurnOnLightCommand and TurnOffLightCommand encapsulate the actions for turning the light on and off.
The RemoteControl (Invoker) triggers the commands without knowing the details of the actions.
The Light (Receiver) performs the actual operations.



