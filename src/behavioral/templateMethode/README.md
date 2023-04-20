# Template Method Pattern

The Template Method Pattern is a behavioral design pattern that defines the skeleton of an algorithm in a base class, allowing subclasses to override specific steps without changing the overall algorithm structure. The pattern promotes code reusability, maintainability, and modularity by separating the invariant (common) parts of an algorithm from the variable (specific) parts.

## Key Concepts

1. **Base Class**: Contains the template method and defines the high-level structure of the algorithm, including the sequence of steps required to perform the algorithm.
2. **Template Method**: A method in the base class that outlines the algorithm skeleton. It calls abstract or virtual methods, which are implemented or overridden by subclasses.
3. **Subclasses**: Inherit from the base class and provide implementations for the abstract or virtual methods, customizing specific steps of the algorithm.

## Advantages

1. Separation of concerns: Encapsulates the variable parts of the algorithm in subclasses, promoting modularity and maintainability.
2. Code reusability: Encourages code reuse by defining the common parts of the algorithm in the base class and allowing subclasses to implement only the variable parts.
3. Consistent algorithm structure: Enforces a consistent structure for the algorithm, making it easier to understand, debug, and modify.

## Usage

Use the Template Method Pattern when:
- You have a series of related algorithms with similar structures but different implementations.
- You want to reuse the common parts of an algorithm and allow customization of specific steps.
- You want to enforce a consistent structure for related algorithms.

## Example

An example of the Template Method Pattern is a data processing pipeline that includes steps such as data extraction, transformation, and loading. The base class defines the overall algorithm structure, and subclasses override specific steps to provide custom implementations for data extraction or transformation.

UML :

![Inheritance uml](/src/behavioral/templateMethode/uml-gof.png?raw=true "strategy pattern uml")


Same UML but now using hooks

![Inheritance uml](/src/behavioral/templateMethode/uml-gof-hooks.png?raw=true "strategy pattern uml")