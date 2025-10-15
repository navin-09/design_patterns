# design_patterns

this repo consists of some commonly used design patterns in industry

# singleTon_design_pattern

| **Concept**                      | **Description**                                                                                                                                                                                   |
| -------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Intent / Purpose**             | Ensures that a class has **only one instance** and provides a **global access point** to it.                                                                                                      |
| **Common Use Cases**             | Database connection managers, logging services, configuration managers, thread pools, caches.                                                                                                     |
| **Key Features**                 | - Private constructor<br>- Static instance<br>- Public static `getInstance()` method                                                                                                              |
| **Thread Safety**                | Achieved using `synchronized`, **double-checked locking**, or the **Initialization-on-Demand Holder** approach.                                                                                   |
| **Lazy vs Eager Initialization** | - **Eager:** instance created at class load (simple, but always created)<br>- **Lazy:** instance created when first requested (saves memory).                                                     |
| **Advantages**                   | ✅ Controlled access to shared resource<br>✅ Saves memory<br>✅ Global access<br>✅ Prevents redundant object creation                                                                           |
| **Disadvantages**                | ❌ Global state can make testing difficult<br>❌ Can introduce tight coupling<br>❌ Breaks dependency injection principles<br>❌ Risk of thread-safety issues if implemented poorly               |
| **Best Practices**               | - Make instance variable `private static volatile`<br>- Use **double-checked locking** or **static inner class**<br>- Keep the constructor private<br>- Prefer immutability inside singleton      |
| **Proof of Singleton**           | - Constructor prints only once<br>- All threads show the same `System.identityHashCode()` value                                                                                                   |
| **Java Implementation Styles**   | 1️⃣ **Eager Initialization**<br>2️⃣ **Lazy Initialization**<br>3️⃣ **Thread-Safe (Synchronized)**<br>4️⃣ **Double-Checked Locking**<br>5️⃣ **Static Inner Class (Bill Pugh)**<br>6️⃣ **Enum Singleton** |
| **When to Use**                  | When exactly **one instance** of a class is required globally.                                                                                                                                    |
| **When _Not_ to Use**            | When objects hold **mutable state** or your system relies heavily on **unit testing / dependency injection**.                                                                                     |
| **Real-World Example**           | `Runtime.getRuntime()`, `Logger.getInstance()`, Spring Beans (default scope = Singleton)                                                                                                          |

# builder_design_pattern

| Concept            | Description                                                 |
| ------------------ | ----------------------------------------------------------- |
| **Purpose**        | Build complex objects with many optional params cleanly.    |
| **Immutability**   | Builder lets you create immutable objects safely.           |
| **Fluent API**     | Chaining methods improves readability.                      |
| **Decoupling**     | Object construction logic is separated from representation. |
| **Best Used When** | Constructors have >3 parameters, especially optional ones.  |

# prototype_design_pattern

| **Aspect**                 | **Description**                                                                                                                                          |
| -------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Pattern Type**           | Creational                                                                                                                                               |
| **Intent**                 | Copy existing objects instead of creating from scratch                                                                                                   |
| **When to Use**            | When object creation is costly (e.g., loading data, complex setup)                                                                                       |
| **Key Methods**            | `clone()` or a copy constructor                                                                                                                          |
| **Advantages**             | ✅ Faster object creation<br>✅ Avoids repeated initialization<br>✅ Easy to make variations                                                             |
| **Disadvantages**          | ❌ Requires deep copy for nested objects<br>❌ Cloning can get complex for reference-heavy classes                                                       |
| **Common Use Cases**       | - Game engines (duplicating characters/enemies)<br>- Document editors (copying shapes)<br>- Database entities caching                                    |
| **Implementation Options** | 1️⃣ Implement your own `clone()`<br>2️⃣ Use Java’s built-in `Cloneable` + `Object.clone()`<br>3️⃣ Use a **copy constructor** or serialization for deep copy |
| **Example Libraries**      | Spring’s Bean cloning, Hibernate entity prototypes                                                                                                       |

# adapter_design_pattern

| **Aspect**               | **Description**                                                                                                                                        |
| ------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------ |
| **Pattern Type**         | Structural                                                                                                                                             |
| **Purpose**              | Bridge between incompatible interfaces                                                                                                                 |
| **Main Participants**    | Target, Adaptee, Adapter, Client                                                                                                                       |
| **Implementation Style** | Class Adapter (via inheritance) or Object Adapter (via composition)                                                                                    |
| **Best Practice**        | Prefer **Object Adapter** (composition) — more flexible                                                                                                |
| **Advantages**           | ✅ Reuse existing code<br>✅ Decouples old and new code<br>✅ Increases flexibility                                                                    |
| **Disadvantages**        | ❌ Adds extra layer (slight overhead)<br>❌ Too many adapters can make system complex                                                                  |
| **Real-world Examples**  | - `InputStreamReader` in Java (adapts byte stream to char stream)<br>- JDBC Drivers (adapters between Java and databases)<br>- Legacy APIs integration |

# facade_design_pattern

| **Aspect**              | **Description**                                                                                                                             |
| ----------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| **Pattern Type**        | Structural                                                                                                                                  |
| **Intent**              | Simplify interaction with a complex subsystem                                                                                               |
| **Main Participants**   | Facade and Subsystems                                                                                                                       |
| **Design Principle**    | “**Talk to friends, not strangers**” — clients should talk only to the Facade                                                               |
| **Advantages**          | ✅ Reduces complexity<br>✅ Improves readability<br>✅ Decouples client from subsystems                                                     |
| **Disadvantages**       | ❌ May become a “god class” if it grows too large                                                                                           |
| **Real-world Examples** | - Spring’s `JdbcTemplate` (hides JDBC complexity)<br>- Hibernate’s `Session` API<br>- Java’s `ExecutorService` (simplifies thread handling) |

# flyWeight_design_pattern

| **Aspect**                   | **Description**                                                                                                                                                                                                                                   |
| ---------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Pattern Type**             | Structural Design Pattern                                                                                                                                                                                                                         |
| **Intent / Purpose**         | Optimize memory usage by sharing **common (intrinsic)** object data among multiple similar objects.                                                                                                                                               |
| **Main Idea**                | Split object data into:<br>• **Intrinsic state** – shared and immutable (inside Flyweight)<br>• **Extrinsic state** – unique and passed from the client                                                                                           |
| **When to Use**              | - You have a **large number of similar objects**.<br>- Object creation consumes too much **memory** or **resources**.<br>- Most objects share the same data/state.                                                                                |
| **Key Components**           | 1️⃣ **Flyweight Interface** – defines shared operations<br>2️⃣ **Concrete Flyweight** – stores intrinsic state<br>3️⃣ **Flyweight Factory** – manages and reuses flyweight objects<br>4️⃣ **Client** – supplies extrinsic state when using flyweights |
| **Intrinsic State**          | Common, shared data that can be reused (e.g., font, color, shape). Stored inside the flyweight.                                                                                                                                                   |
| **Extrinsic State**          | Data specific to each object instance (e.g., coordinates, user input). Passed by the client at runtime.                                                                                                                                           |
| **Implementation Principle** | "Share objects instead of creating new ones" (object reuse via a centralized factory/pool).                                                                                                                                                       |
| **Advantages**               | ✅ Reduces memory usage<br>✅ Improves performance for large object sets<br>✅ Encourages immutability (safe sharing)<br>✅ Centralized object management                                                                                         |
| **Disadvantages**            | ❌ Adds complexity<br>❌ Harder to manage extrinsic state<br>❌ Debugging shared state can be tricky                                                                                                                                              |
| **Best Practices**           | - Keep flyweight objects **immutable**.<br>- Use **factories** to control object creation.<br>- Use **maps (HashMap / ConcurrentHashMap)** to store/reuse flyweights.<br>- Only extract truly sharable data.                                      |
| **Design Principle**         | “**Share objects to save space when they have similar state.**”                                                                                                                                                                                   |
| **Common Examples**          | - Java `Integer.valueOf()` caching<br>- `String` interning (`String.intern()`)<br>- Character glyph rendering in text editors<br>- Game object sharing (e.g., trees, bullets)                                                                     |
| **Real-world Analogy**       | Airline seat model 🎫 — one seat _template_ shared, position (row/column) supplied per booking.                                                                                                                                                   |
| **In Java API**              | - `Integer`, `Boolean`, and `Character` caching<br>- `String.intern()`<br>- Java’s `Font` and `Color` reuse in AWT/Swing                                                                                                                          |
