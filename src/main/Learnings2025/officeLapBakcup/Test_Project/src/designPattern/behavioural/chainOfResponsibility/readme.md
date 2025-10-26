The Chain of Responsibility (CoR) design pattern is a behavioral pattern that lets 
you pass requests along a chain of handlers. Each handler decides either to process 
the request or to pass it to the next handler in the chain. This pattern promotes loose coupling, 
as the sender doesn’t need to know which handler processes the request.


**Core Concepts**
**Handler Interface**: Defines a method to process requests and a reference to the next handler.

**Concrete Handler**s: Implement the handler interface to process specific requests or pass them on.

**Client:** Sends requests to the head of the chain without needing to know which handler will ultimately process it.


Production-Grade Example: Customer Support System
Scenario
A customer support system with three levels: Level 1 handles basic requests, Level 2 handles intermediate requests, and Level 3 handles critical issues.

