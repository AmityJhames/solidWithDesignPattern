# Solid With Design Pattern
# NEU Library System 

##  Problem Statement

The NEU Library offers various resource types like books, journals, theses, and newspapers. The current system has the `Student` class depending directly on each type with methods like `borrowBook()`, `borrowJournal()`, etc.

This violates the Dependency Inversion Principle (DIP) because the high-level module (`Student`) depends on low-level modules (`Book`, `Journal`), making it difficult to extend the system.

##  Solution

We refactored the system using interface-based design, ensuring `Student` depends only on the abstraction `IResource`. New resource types like `AudioBook` or `EJournal` can now be added without modifying existing code.

##  UML Class Diagram

