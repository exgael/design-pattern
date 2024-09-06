The Strategy Pattern, also known as the Policy Pattern, is a behavioral design pattern that aims to solve the problem of selecting an algorithm or behavior at runtime. It helps to encapsulate a family of related algorithms and make them interchangeable, allowing clients to choose the appropriate algorithm or behavior without modifying the code that uses it.

The primary goals of the Strategy Pattern are to:

1 - Encapsulate related algorithms: 
    
    By defining a common interface for all supported algorithms, the Strategy Pattern promotes the separation of concerns, keeping the algorithm implementations independent from the context that uses them. This encourages modular, maintainable, and reusable code.

2 - Enable the dynamic selection of algorithms: 
    
    The Strategy Pattern allows clients to change the algorithm or behavior used by a context object at runtime. This provides flexibility in choosing the appropriate algorithm based on specific conditions or requirements, without having to modify the client or context code.

3 - Reduce code duplication: 
    
    Instead of implementing multiple versions of a class or method with slight variations in behavior, the Strategy Pattern encourages the encapsulation of varying behaviors as separate classes that implement a common interface. This promotes code reusability and reduces the risk of bugs caused by duplicated code.

4 - Improve maintainability and testability: 
    
    The Strategy Pattern promotes the decoupling of algorithm implementations from the context that uses them. This makes it easier to modify, extend, or replace individual algorithms without affecting the rest of the system. It also simplifies testing, as each algorithm can be tested independently of the context that uses it.

In summary, the Strategy Pattern addresses the problem of selecting and managing related algorithms or behaviors in a flexible, maintainable, and reusable way. It allows clients to dynamically choose the most appropriate algorithm or behavior for a specific situation without modifying the code that uses it.



![strategy pattern uml](/src/behavioral/strategy/uml.png?raw=true "strategy pattern uml")

# Strategy vs State

Both the Strategy Pattern and the State Pattern are behavioral design patterns that involve encapsulating related behaviors into separate classes. However, their goals and use cases are different. Here are the main differences between the two patterns:

### Purpose:
    
`Strategy Pattern`: 
   
    The primary goal is to encapsulate a family of related algorithms, making them interchangeable at runtime based on specific requirements or conditions. The focus is on selecting the most appropriate algorithm or behavior for a given situation.

`State Pattern`: 

    The primary goal is to manage state transitions and the corresponding behavior changes within an object. The focus is on encapsulating the different states of an object and their associated behaviors, making it easier to add or modify states without affecting the rest of the system.

### Context:
    
`Strategy Pattern`: 
    
    The context usually contains a reference to a strategy object and delegates the execution of a task or operation to the selected strategy. The context itself is not aware of the specific algorithm being used.
    
`State Pattern`: 
    
    The context maintains a reference to a state object that represents its current state. When the context receives a request, it delegates the request to the current state object, which may result in a state transition.

### Client Interaction:

`Strategy Pattern`: 
    
    Clients usually interact with the context to set or change the strategy. They are responsible for selecting the appropriate algorithm based on specific conditions or requirements.

`State Pattern`: 
    
    Clients generally interact with the context without directly controlling the state transitions. The state transitions are managed internally by the context or the state objects themselves based on the system's rules.

### Implementation:
    
`Strategy Pattern`: 
        
    Strategies are often interchangeable and unrelated to each other, focusing on the algorithm itself. The context may pass data to the strategy to perform the operation, but the context's state is not affected by the strategy.
   
`State Pattern`: 
    
    State objects usually share a common interface and may be related through inheritance or composition. State objects often have access to the context, allowing them to modify the context's state or trigger state transitions.

In summary, while both patterns involve encapsulating related behaviors into separate classes, the Strategy Pattern focuses on selecting and managing interchangeable algorithms, whereas the State Pattern focuses on managing state transitions and their associated behaviors within an object.


