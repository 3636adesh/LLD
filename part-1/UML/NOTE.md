# 📘 UML (Unified Modeling Language)

## What is UML?

**UML (Unified Modeling Language)** is a standard visual language used to represent software design.

It helps developers:
- Visualize system structure
- Understand relationships
- Plan architecture before coding

---

# 📌 What is a Class Diagram?

A **Class Diagram** is a type of UML diagram that shows:

- Classes
- Variables (Attributes)
- Methods (Functions)
- Relationships between classes

It acts like a blueprint of your application.

---

# 🚗 Example — Java Class

```java
class Car {

    String number;

    void start() {

    }
}
```

---

# 📘 UML Representation

```text
+------------------+
| Car              |
+------------------+
| number : String  |
+------------------+
| start() : void   |
+------------------+
```

---

# 🧱 Explanation

## 1️⃣ Class Name

```text
Car
```

Represents the class.

---

## 2️⃣ Attributes (Variables)

```text
number : String
```

Means:
- Variable name = `number`
- Data type = `String`

---

## 3️⃣ Methods (Functions)

```text
start() : void
```

Means:
- Method name = `start`
- Return type = `void`

---

# 🔑 UML Access Modifiers

| Symbol | Meaning |
|--------|---------|
| `+` | Public |
| `-` | Private |
| `#` | Protected |

Example:

```text
+ start() : void
- number : String
```

---

# 🎯 Why Use UML?

UML helps in:
- Designing systems before coding
- Understanding object relationships
- Writing scalable applications
- Explaining design in interviews

---

# 🚀 Common UML Relationships

| Relationship | Meaning |
|--------------|---------|
| Association | Uses |
| Aggregation | Weak HAS-A |
| Composition | Strong HAS-A |
| Inheritance | IS-A |

---

# 📌 Example — Inheritance

```text
Vehicle <|-- Car
```

Meaning:

```text
Car IS-A Vehicle
```

Java:

```java
class Car extends Vehicle {

}
```
