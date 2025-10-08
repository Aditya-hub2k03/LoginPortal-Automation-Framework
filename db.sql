CREATE DATABASE IF NOT EXISTS login_portal;
USE login_portal;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL,
    name VARCHAR(50) NOT NULL
);

INSERT INTO users (email, password, name) VALUES
('john@example.com', '12345', 'John'),
('mary@example.com', '67890', 'Mary'),
('alice@example.com', 'alice123', 'Alice'),
('bob@example.com', 'bob123', 'Bob');
