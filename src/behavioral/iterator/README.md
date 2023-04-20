The Iterator Pattern is a behavioral design pattern that aims to solve the problem of accessing and traversing elements of a collection (such as an array, list, or tree) without exposing the underlying representation of the collection. The pattern allows you to iterate over different types of collections using a common interface, providing a consistent way to traverse and manipulate their elements.

The primary goals of the Iterator Pattern are to:

1 - Encapsulate the internal structure of a collection: By providing an interface for accessing elements, the pattern prevents clients from needing to know the details of the data structure used to store the elements. This promotes loose coupling and makes it easier to change the underlying data structure without affecting client code.

2 - Provide a uniform way to traverse different types of collections: Since the Iterator Pattern abstracts the way elements are accessed, it allows clients to work with various collection types without having to write specific code for each one. This promotes code reusability and maintainability.

3 - Support different traversal algorithms: The Iterator Pattern can be extended to support various traversal strategies, such as depth-first, breadth-first, or other custom algorithms, depending on the needs of the application. This makes it easier to switch between different traversal algorithms without changing the client code.
In summary, the Iterator Pattern addresses the problem of accessing and traversing elements in a collection in a consistent and flexible way, while hiding the details of the underlying data structure and allowing for easy adaptability to different traversal strategies.

![iterator uml](/src/behavioral/iterator/uml.png?raw=true "iterator uml")