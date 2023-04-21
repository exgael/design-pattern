# Chain of Responsibility Pattern

The Chain of Responsibility Pattern is a behavioral design pattern that decouples the sender of a request from its receiver by giving multiple objects a chance to handle the request. The pattern chains the receiving objects together and passes the request along the chain until an object handles it. This pattern promotes loose coupling, flexibility, and dynamic handling of requests in your application.

## Key Concepts

1. **Handler**: An interface or abstract class that defines the method(s) for handling requests and setting the next handler in the chain. It encapsulates the common behavior for all handlers in the chain.
2. **Concrete Handler**: A class that implements the Handler interface or inherits from the abstract Handler class. It contains the logic for handling a specific type of request or condition, and passes the request to the next handler in the chain if it cannot handle it.
3. **Client**: The object that creates and configures the chain of handlers, setting their order and relationships.

## Advantages

1. Loose coupling: The Chain of Responsibility Pattern promotes loose coupling between the sender of a request and its receivers, making it easier to modify, extend, or replace individual handlers without affecting the rest of the system.
2. Dynamic handling: The pattern allows you to add or remove handlers at runtime, providing greater flexibility in managing request handling.
3. Increased flexibility: Handlers can be rearranged or added to the chain easily, allowing you to modify the order or add new functionality without changing the existing code.
4. Simplified sender: The sender of a request doesn't need to know which handler will process the request, simplifying its implementation and reducing its dependencies.

## Usage

Use the Chain of Responsibility Pattern when:
- You have multiple objects that may handle a request, and you want to decouple the sender of the request from the objects that handle it.
- You want to provide a flexible and dynamic way to handle requests, allowing for the addition or removal of handlers at runtime.
- You want to simplify the sender by only requiring it to send the request to the first handler in the chain.

## Example

An example of the Chain of Responsibility Pattern is a customer support system, where different support agents handle requests based on their complexity. The support agents are organized in a chain (e.g., level 1, level 2, and level 3 agents). When a request is received, it is passed along the chain until an agent is able to handle it. If a level 1 agent cannot handle the request, it is passed to the level 2 agent, and so on, until the request is handled or reaches the end of the chain.

## Our example : 

## pipeline
![ChainOfResponsabilty uml](/images/chain-of-responsability-ex-pipeline.png?raw=true "ChainOfResponsabilty uml")

## UML
![ChainOfResponsabilty uml](/images/chain-of-responsability-uml.png?raw=true "ChainOfResponsabilty uml")