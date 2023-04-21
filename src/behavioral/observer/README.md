# Observer Pattern

The Observer Pattern, also known as the Publish-Subscribe Pattern, is a behavioral design pattern that defines a one-to-many dependency between objects, where a subject (also known as the publisher or observable) maintains a list of its dependents (observers or subscribers) and notifies them automatically of any state changes. This pattern promotes loose coupling, modularity, and effective handling of events in your application.

## Key Concepts

1. **Subject (Publisher or Observable)**: The object that maintains a list of its observers and sends notifications when its state changes. It typically provides methods for attaching, detaching, and notifying observers.
2. **Observer (Subscriber)**: An interface or abstract class that defines the method(s) for receiving updates from the subject. Concrete observers implement this interface to receive notifications.
3. **Concrete Observer**: A class that implements the Observer interface or inherits from the abstract Observer class. It contains the logic to handle the update or event when notified by the subject.
4. **Client**: The object that creates and configures the subject and observers, attaching the observers to the subject.

## Advantages

1. Loose coupling: The Observer Pattern promotes loose coupling between the subject and its observers, making it easier to modify, extend, or replace individual components without affecting the rest of the system.
2. Dynamic relationships: Observers can be added or removed at runtime, allowing for greater flexibility in managing dependencies and responding to events.
3. Efficient event handling: The pattern enables efficient handling of events by only notifying interested observers, reducing unnecessary processing.

## Usage

Use the Observer Pattern when:
- You have a one-to-many relationship between objects, and you want to notify dependents when the state of an object changes.
- You want to promote loose coupling between the components of your system.
- You need a dynamic and efficient way to handle events in your application.

## Example

An example of the Observer Pattern is a weather monitoring system, where a weather station (subject) collects data and sends updates to various display components (observers), such as temperature display, humidity display, and pressure display. When new data is collected, the weather station notifies all the registered display components, which then update their displays accordingly.


![observer uml](/images/observer-uml-gof.png?raw=true "observer uml")
![observer uml](/images/observer-push-style-uml.png?raw=true "observer uml")
![observer uml](/images/observer-pull-style-uml.png?raw=true "observer uml")
