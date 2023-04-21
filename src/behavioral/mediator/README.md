# Mediator Pattern

The Mediator Pattern is a behavioral design pattern that defines an object that encapsulates how a set of objects interact, promoting loose coupling by preventing objects from referring to each other explicitly. The pattern simplifies communication between objects in a complex system, centralizing and managing their interactions through a mediator object.

## Key Concepts

1. **Mediator**: An interface or abstract class that defines the methods for communication between the components (colleagues). It encapsulates the interaction logic and coordinates the communication between the colleagues.
2. **Concrete Mediator**: A class that implements the Mediator interface or inherits from the abstract Mediator class. It contains the actual implementation of the coordination logic and maintains references to the colleagues.
3. **Colleague**: An interface or abstract class that defines the methods for interacting with the mediator. Components implementing this interface communicate with the mediator rather than directly with other components.
4. **Concrete Colleague**: A class that implements the Colleague interface or inherits from the abstract Colleague class. These are the actual components that need to communicate with each other through the mediator.
5. **Client**: The object that creates and configures the mediator and colleagues, establishing their relationships and interactions.

## Advantages

1. Loose coupling: The Mediator Pattern promotes loose coupling between components by centralizing their communication in a single mediator object, making it easier to modify, extend, or replace individual components without affecting the rest of the system.
2. Simplified communication: The pattern simplifies communication between components by abstracting the interaction logic in the mediator, reducing the complexity of the system and making it easier to understand and maintain.
3. Easier reuse of components: By decoupling the components, the Mediator Pattern facilitates the reuse of individual components in different contexts.

## Usage

Use the Mediator Pattern when:
- You have a complex system with many interacting components, and you want to simplify their communication and relationships.
- You want to promote loose coupling between components and centralize their interaction logic.
- You want to reuse components more easily in different contexts or systems.

## Example

An example of the Mediator Pattern is a chat room application, where users (colleagues) send messages to each other through a centralized chat room (mediator). The chat room manages the delivery of messages, ensuring that they are sent to the correct recipients. By centralizing the communication logic in the chat room, the user components are decoupled from each other and can be easily modified or extended without affecting the overall system.



![mediator uml](/src/behavioral/memento/uml.png?raw=true "mediator uml")
