# Task 4 — Full CRUD API using Spring Boot

This task implements a full REST API for a `Product` resource using Java + Spring Boot.

---

## 📌 Features
- Create / Read / Update / Delete operations  
- JPA + Hibernate ORM  
- Input validation with annotations  
- JSON responses  
- MySQL persistent storage  
- Postman testing screenshots  

---

## ▶ How to Run

### 1. Update MySQL credentials  
Edit `application.properties`:
```
spring.datasource.username=root
spring.datasource.password=root
```

### 2. Start the application
```
mvn spring-boot:run
```

### 3. Test using Postman  
- GET `/api/products`  
- POST `/api/products`  
- PUT `/api/products/{id}`  
- DELETE `/api/products/{id}`  

---

## 🛠 Tools Used
- Java  
- Spring Boot  
- JPA / Hibernate  
- MySQL  
- Postman  
- Maven  

---

## 🚀 Submission  
This task is complete and ready for review.
