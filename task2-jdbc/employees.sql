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
