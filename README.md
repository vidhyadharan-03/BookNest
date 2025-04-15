# 📘 BookNest – Library Management System

**BookNest** is a console-based Library Management System built using Java and designed with solid **Object-Oriented Programming (OOP)**, **Low-Level Design (LLD)** principles, and **SOLID architecture**.  
This project simulates a real-world library environment, allowing interactions between **librarians** and **students**, supporting all major operations like adding, borrowing, returning, and tracking books.

> 🎯 This project was built as part of an LLD practice challenge to reinforce backend design thinking and system development using core Java.

---

## 🔧 Tech Stack

- 👨‍💻 Language: `Java`
- 🗂 Architecture: `Model - Service - Controller` layered pattern
- 🧠 Principles: `OOP`, `LLD`, `SOLID`
- 📚 Data Handling: Java `Collections` (`HashMap`, `List`, `Iterator`)
- 📦 Build Tool: `Maven`
- 📁 IDE: IntelliJ IDEA

---

## ✨ Features

### 👩‍🎓 Student/User Functionality
- ✅ Register as a user
- 🔍 Search for a book by title
- 📚 Borrow available books (max 3)
- 📜 View borrowing history
- 🔁 Return borrowed books (removes from both user and librarian tracking)

### 👨‍🏫 Librarian Functionality
- ➕ Add new books to catalog
- 🔍 Search books by title
- 👁 View current borrowings (who borrowed what)
- ♻️ Update book availability when returned

---

## 🔄 Recent Major Updates

| Date       | Feature                                             |
|------------|-----------------------------------------------------|
| April 14   | ✅ **Return Book Feature** from both student & librarian side |
| April 12   | ✅ **Book Search** feature by name (case-insensitive) |
| April 11   | ✅ **Book Lending System** with borrowing limits     |
| April 10   | ✅ Initial structure with Models, Services, Controllers |

---


---

## ✅ Design Principles Applied

### 🧠 SOLID Principles

- **S** – Single Responsibility: Classes do one thing only (e.g., `UserServicing` only handles user logic)
- **O** – Open/Closed: Service interfaces support extension without modifying logic
- **L** – Liskov Substitution: No inheritance violations; interchangeable behavior
- **I** – Interface Segregation: `LibrarianServices` and `UserServices` are cleanly separated
- **D** – Dependency Inversion: Logic depends on interfaces, not concrete classes

### ⚙️ LLD Concepts

- Layered separation of concerns (Model, Service, Controller)
- Decoupled flow and role-based abstraction
- Domain-driven method naming and responsibility split
  
###⭐️ If you liked this project...
Give it a ⭐️ on GitHub and share your thoughts on LinkedIn www.linkedin.com/in/vidhyadharan-r
---

## 📊 Data Structures Used

- `HashMap<Books, String>` → Book catalog with availability
- `HashMap<Books, UserInfo>` → Borrowed book tracking
- `List<Books>` → User borrow list
- `ArrayList<UserInfo>` → Registered users

---

## 🚀 Getting Started

### Prerequisites
- Java 8 or higher
- IntelliJ IDEA or any Java IDE
- Maven (project is Maven-structured)

### Steps
```bash
git clone https://github.com/vidhyadharan-03/BookNest.git
cd BookNest
Run Main.java
```

⭐️ If you liked this project...
Give it a ⭐️ on GitHub and share your thoughts on LinkedIn www.linkedin.com/in/vidhyadharan-r




