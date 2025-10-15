# design_patterns
this repo consists of some commonly used design patterns in industry

# singleTon_design_pattern

| **Concept**                       | **Description**                                                                                                                                                                                         |
| -------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Intent / Purpose**             | Ensures that a class has **only one instance** and provides a **global access point** to it.                                                                                                            |
| **Common Use Cases**             | Database connection managers, logging services, configuration managers, thread pools, caches.                                                                                                           |
| **Key Features**                 | - Private constructor<br>- Static instance<br>- Public static `getInstance()` method                                                                                                                    |
| **Thread Safety**                | Achieved using `synchronized`, **double-checked locking**, or the **Initialization-on-Demand Holder** approach.                                                                                         |
| **Lazy vs Eager Initialization** | - **Eager:** instance created at class load (simple, but always created)<br>- **Lazy:** instance created when first requested (saves memory).                                                           |
| **Advantages**                   | ✅ Controlled access to shared resource<br>✅ Saves memory<br>✅ Global access<br>✅ Prevents redundant object creation                                                                                     |
| **Disadvantages**                | ❌ Global state can make testing difficult<br>❌ Can introduce tight coupling<br>❌ Breaks dependency injection principles<br>❌ Risk of thread-safety issues if implemented poorly                         |
| **Best Practices**               | - Make instance variable `private static volatile`<br>- Use **double-checked locking** or **static inner class**<br>- Keep the constructor private<br>- Prefer immutability inside singleton            |
| **Proof of Singleton**           | - Constructor prints only once<br>- All threads show the same `System.identityHashCode()` value                                                                                                         |
| **Java Implementation Styles**   | 1️⃣ **Eager Initialization**<br>2️⃣ **Lazy Initialization**<br>3️⃣ **Thread-Safe (Synchronized)**<br>4️⃣ **Double-Checked Locking**<br>5️⃣ **Static Inner Class (Bill Pugh)**<br>6️⃣ **Enum Singleton** |
| **When to Use**                  | When exactly **one instance** of a class is required globally.                                                                                                                                          |
| **When *Not* to Use**            | When objects hold **mutable state** or your system relies heavily on **unit testing / dependency injection**.                                                                                           |
| **Real-World Example**           | `Runtime.getRuntime()`, `Logger.getInstance()`, Spring Beans (default scope = Singleton)                                                                                                                |


# builder_design_pattern

| Concept            | Description                                                 |
| ------------------ | ----------------------------------------------------------- |
| **Purpose**        | Build complex objects with many optional params cleanly.    |
| **Immutability**   | Builder lets you create immutable objects safely.           |
| **Fluent API**     | Chaining methods improves readability.                      |
| **Decoupling**     | Object construction logic is separated from representation. |
| **Best Used When** | Constructors have >3 parameters, especially optional ones.  |


# prototype_design_pattern

| **Aspect**                 | **Description**                                                                                                                                             |
| -------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Pattern Type**           | Creational                                                                                                                                                  |
| **Intent**                 | Copy existing objects instead of creating from scratch                                                                                                      |
| **When to Use**            | When object creation is costly (e.g., loading data, complex setup)                                                                                          |
| **Key Methods**            | `clone()` or a copy constructor                                                                                                                             |
| **Advantages**             | ✅ Faster object creation<br>✅ Avoids repeated initialization<br>✅ Easy to make variations                                                                   |
| **Disadvantages**          | ❌ Requires deep copy for nested objects<br>❌ Cloning can get complex for reference-heavy classes                                                            |
| **Common Use Cases**       | - Game engines (duplicating characters/enemies)<br>- Document editors (copying shapes)<br>- Database entities caching                                       |
| **Implementation Options** | 1️⃣ Implement your own `clone()`<br>2️⃣ Use Java’s built-in `Cloneable` + `Object.clone()`<br>3️⃣ Use a **copy constructor** or serialization for deep copy |
| **Example Libraries**      | Spring’s Bean cloning, Hibernate entity prototypes                                                                                                          |
