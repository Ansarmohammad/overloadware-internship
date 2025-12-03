# Task 2 — Database Connectivity using Java (JDBC + MySQL)

This task demonstrates how a Java application connects to a MySQL database using JDBC and retrieves data from a table.

---

## 📌 Features Implemented
- MySQL database connection  
- Simple `employees` table  
- SQL script for creating and seeding data  
- JDBC code to connect and fetch rows  
- Clean console output with formatted data  

---

## 🗄 Database Setup

Run the following queries (save as `employees.sql` and run in MySQL):

```sql
CREATE DATABASE internship_demo;
USE internship_demo;

CREATE TABLE employees (
  id INT PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(100),
  role VARCHAR(100),
  salary DOUBLE
);

INSERT INTO employees (name, role, salary) VALUES
('Anita', 'Java Developer', 350000),
('Ravi', 'Backend Developer', 420000),
('Sana', 'QA Engineer', 300000');
```

---

## ▶ How to Run

### 1. Build
```
mvn compile
```

### 2. Run
```
mvn exec:java -Dexec.mainClass="JdbcSelectExample"
```

---

## 📸 Screenshots Included
- Database table  
- Console output fetching rows  

---

## 🛠 Tools Used
- Java  
- MySQL  
- JDBC  
- Maven  
- VS Code / IntelliJ  

---

## 🚀 Submission  
This task is complete and ready for review.
