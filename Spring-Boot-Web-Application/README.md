# Spring Boot Web Application

A web-based employee management application developed using Spring Boot, Spring Data JPA, Hibernate, MySQL, and Thymeleaf.

## Overview

This application demonstrates how to develop a Spring Boot web application that accepts employee information through a web form, stores the data in a MySQL database, and displays employee records through a Thymeleaf web interface.

## Features

- Add employee records
- Display employee records
- Store employee information in MySQL
- Thymeleaf-based web interface
- Spring Data JPA integration
- Hibernate-based database table creation

## Application Flow

User
  ↓
Thymeleaf Web Page
  ↓
Employee Controller
  ↓
Spring Data JPA Repository
  ↓
Hibernate
  ↓
MySQL Database

## Technologies Used

Java 17
Spring Boot 3.2.5
Spring Web
Spring Data JPA
Hibernate
MySQL
Thymeleaf
Maven

## Project Structure

Spring-Boot-Web-Application
└── src
    └── main
        ├── java
        │   └── com.springweb
        │       ├── SpringBootWebAppApplication.java
        │       ├── controller
        │       │   └── EmployeeController.java
        │       ├── entity
        │       │   └── Employee.java
        │       └── repository
        │           └── EmployeeRepository.java
        │
        └── resources
            ├── application.properties
            └── templates
                └── employees.html

## Database 

Database used: springweb
The employee table is created automatically using JPA/Hibernate.

## Running the Application

1. Configure MySQL credentials in application.properties.
2. Create the springweb database.
3. Run SpringBootWebAppApplication.java.
4. Open the application in a browser: http://localhost:8083/
5. Enter employee details and click Save Employee.
6. Employee records are displayed on the web page and stored in MySQL.

## Author

**Vaibhavi Parmar**
