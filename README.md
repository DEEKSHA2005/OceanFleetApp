# Ocean Fleet App

## Overview

Ocean Fleet App is a **console-based Java application** developed to demonstrate **Object-Oriented Programming (OOPS)** concepts and **Java Collections**.

The application manages vessel performance data, allowing users to:

* Add vessel details
* Search vessels by ID
* Identify high-performance vessels based on speed

The project follows a **clean layered architecture (Model–Utility–UI)** and is implemented using **GitFlow with UC-wise development**.

---

### Package Responsibilities

* **model** → Represents data (Vessel class)
* **util** → Contains business logic (VesselUtil)
* **ui** → Handles user interaction (UserInterface)

---

## Features (Use Cases)

### 🔹 UC1 – Vessel Model

* Created `Vessel` class with:

    * vesselId
    * vesselName
    * averageSpeed
    * vesselType
* Applied **Encapsulation** using private fields and getters/setters

---

### 🔹 UC2 – Store Vessel Records

* Used `List<Vessel>` to store multiple vessels
* Implemented:

  ```java
  addVesselPerformance(Vessel vessel)
  ```

---

### 🔹 UC3 – Search Vessel by ID

* Implemented:

  ```java
  getVesselById(String vesselId)
  ```
* Returns vessel if found, otherwise `null`

---

### 🔹 UC4 – High Performance Vessels

* Implemented:

  ```java
  getHighPerformanceVessels()
  ```
* Identifies vessels with **maximum average speed**

---

### 🔹 UC5 – Console-Based User Interface

* Created `UserInterface` with `main()` method
* Handles:

    * Input using `Scanner`
    * Object creation
    * Method calls
    * Output display

---

### 🔹 UC6 – OOPS Refactor

* Applied OOPS principles:

    * **Encapsulation** → Private fields in model
    * **Abstraction** → UI interacts via methods
    * **Modularity** → Separate packages
    * **Reusability** → Utility methods reusable
    * **Separation of Concerns**

---
## GitFlow Process Followed

* Feature branch created for each UC:

    * `feature/uc1-vessel-model`
    * `feature/uc2-store-vessels`
    * `feature/uc3-search-vessel`
    * `feature/uc4-high-performance`
    * `feature/uc5-user-interface`
    * `feature/uc6-oops-refactor`

* All features merged into **develop branch**

* Clean commit history maintained

---

## Key Concepts Used

* Java Classes & Objects
* Encapsulation
* Abstraction
* Modularity
* Java Collections (`List`)
* Iteration & Searching
* Console-based application
* Clean architecture design

---

##  Sample Input

```
3
V001:Sea King:25.5:Cargo
V002:Ocean Star:18.0:Tanker
V003:Wave Rider:22.3:Cruise
V001
```

---

##  Sample Output

```
V001 | Sea King | Cargo | 25.5 knots
High performance vessels are
V001 | Sea King | Cargo | 25.5 knots
```

---

##  Conclusion

Ocean Fleet App demonstrates how to build a structured Java application using **OOPS principles**, **collections**, and **GitFlow practices**, ensuring maintainable, scalable, and clean code.

---
