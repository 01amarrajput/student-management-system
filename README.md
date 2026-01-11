# Student Management System

A Java-based console application designed to manage student records efficiently using JDBC and MySQL.  
The system supports full CRUD (Create, Read, Update, Delete) operations while following Object-Oriented Programming principles.

---

## 🚀 Features
- Add new student records  
- View all students  
- Update student details  
- Delete student records  
- Menu-driven console interface  

---

## 🛠 Tech Stack
- **Java**
- **JDBC**
- **MySQL**
- **OOP Concepts**

---

## 🧠 Concepts Used
- Object-Oriented Programming (Encapsulation, Abstraction)
- JDBC for database connectivity
- MySQL database operations
- Exception handling
- Menu-driven program design

---

## 🗄 Database Setup
```sql
CREATE DATABASE student_db;

USE student_db;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    email VARCHAR(50),
    course VARCHAR(30),
    percentage DOUBLE
);

## Author
Amar Rajput
