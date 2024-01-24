# Design Patterns

## Creational Patterns
- Process of object creation to make it more flexible and decoupled from the system.
- Abstract the instantiation process, making the system independent of how its objects are created, composed, and represented.

### Singleton
**Description:**
The Singleton pattern ensures a class has only one instance and provides a global point of access to it.

**Pros:**
- Single instance ensures a controlled access point.
- Lazy initialization for efficient resource utilization.

**Cons:**
- Singleton instance is global and often hidden behind static methods, creating mocks and test doubles for it can be challenging
- If the Singleton instance fails, it can impact the entire application.

### Factory
**Description:**
Provides an interface for creating objects without exposing the exact type of object being created

**Pros:**
- New types of objects can be easily added without modifying existing code

**Cons:**
- Can introduce additional classes and interfaces, making the code slightly more complex.

### Abstract Factory
**Description:**
An extension of the Factory Design Pattern that creates families of related objects without specifying their concrete classes

**Pros:**
- Simplifies adding new product families without modifying existing code

**Cons:**
- Can introduce additional classes and interfaces, making the code slightly more complex.
- More complex than Factory Pattern as it requires more classes and interfaces for each family of objects.

### Builder
**Description:**
The Builder pattern separates the construction of a complex object from its representation.

**Pros:**
- Allows the construction of complex objects step by step.
- Facilitates the creation of different representations.

**Cons:**
- Requires creating a separate builder class.
- Increased code complexity compared to a simple constructor.

## Structural Patterns
- Category of design patterns that focus on composing objects and classes to form larger structures.
- Focus on relationships and interactions between entities within a system. 

### Adapter
**Description:**
The Adapter pattern allows incompatible interfaces to work together.

**Pros:**
- Enables the integration of new components without modifying existing code.
- Enhances code usability by connecting legacy and new code.

**Cons:**
- Can lead to increased complexity with multiple adapters.

### Decorator
**Description:**
The Decorator pattern attaches additional responsibilities to an object dynamically.

**Pros:**
- Flexible alternative to subclassing for extending functionality.
- Allows for a combination of behavior through composition.

**Cons:**
- Can result in a large number of small classes.
- May be challenging to understand due to the dynamic nature of decorations.

## Behavioral Patterns
- Category of design patterns that focus on the interaction and collaboration between objects.
- Define the ways in which objects communicate and collaborate to achieve a common goal.

### Strategy
**Description:**
The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.

**Pros:**
- Enables the selection of an implementation at runtime.
- Core logic remains unchanged, even when new strategies are introduced which promotes code stability and reduces 
the risk of introducing bugs.

**Cons:**
- Clients need to be aware of different strategies.
- May lead to increased class count.

### Observer
**Description:**
The Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

**Pros:**
- Promotes loose coupling between objects.
- Supports broadcasting changes to multiple dependent objects.

**Cons:**
- Care is needed to avoid circular dependencies.
- Not suitable for scenarios with numerous observers.

## Conclusion
Choose the appropriate design pattern based on the specific requirements of your project. Each pattern comes with its own set of trade-offs, and the decision should be made based on the design goals and constraints.