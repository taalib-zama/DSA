The Shape class acts as the abstraction, and Circle and Rectangle are refined abstractions.
The Color interface is the implementor, and RedColor and BlueColor are concrete implementors.
The bridge between the abstraction and the implementation is established through composition (Shape has a Color).
This pattern allows you to add new shapes or colors independently without modifying existing code.