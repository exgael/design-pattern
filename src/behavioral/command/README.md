# Command Pattern

The Command Pattern is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This encapsulation allows you to pass requests as method arguments, delay or queue the execution of requests, and even support undoable operations. The pattern promotes separation of concerns, increased modularity, and flexibility in your application.

## Key Concepts

1. **Command**: An interface or abstract class that defines the method(s) for executing a specific action or request.
2. **Concrete Command**: A class that implements the Command interface or inherits from the abstract Command class. It contains the actual implementation of the action and a reference to the receiver.
3. **Receiver**: The object that performs the actual work when the command is executed. It contains the business logic for handling the request.
4. **Invoker**: The object that holds a reference to the command and is responsible for executing it. The invoker is unaware of the specific implementation details of the command.
5. **Client**: The object that creates and configures the Concrete Command, specifying the receiver and any other necessary information. The client is also responsible for passing the command to the invoker.

## Advantages

1. Separation of concerns: The Command Pattern separates the object that issues a request from the object that actually performs it, promoting modularity and maintainability.
2. Decoupling of sender and receiver: The pattern decouples the sender (invoker) from the receiver, allowing for more flexibility in the system's structure.
3. Extensibility: New commands can be easily added to the system without modifying existing code.
4. Support for undo/redo operations: By encapsulating the state required to perform an action, the Command Pattern can support undo and redo functionality.
5. Support for delayed or queued execution: Commands can be stored and executed later or even in a different order if necessary.

## Usage

Use the Command Pattern when:
- You want to separate the object that issues a request from the object that actually performs it.
- You need to support undo/redo operations or implement a history of executed actions.
- You want to implement delayed or queued execution of requests.

## Example

An example of the Command Pattern is a text editor with a toolbar for performing actions like copy, paste, and undo. The toolbar (invoker) holds references to command objects representing each action. When the user clicks a button, the corresponding command is executed. The command objects encapsulate the logic required to perform the action on the text (receiver), allowing for easy extension and modification of the editor's functionality.
