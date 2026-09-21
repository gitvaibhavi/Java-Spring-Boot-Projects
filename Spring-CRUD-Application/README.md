# Spring CRUD Application

A RESTful CRUD application developed using Spring Boot, Spring Data JPA, Hibernate, and MySQL.

## Overview

This application demonstrates how to build a Spring Boot application that stores employee data in a MySQL database and performs Create, Read, Update, and Delete operations through REST APIs.

## Features

- Add a new employee
- Retrieve all employees
- Retrieve an employee by ID
- Update employee information
- Delete an employee
- MySQL database integration
- Automatic database table creation using JPA/Hibernate

## REST API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | `/employee/save` | Create an employee |
| GET | `/employee/all` | Get all employees |
| GET | `/employee/{id}` | Get employee by ID |
| PUT | `/employee/update/{id}` | Update an employee |
| DELETE | `/employee/delete/{id}` | Delete an employee |

## Technologies Used

- Java 17
- Spring Boot 3.2.5
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Postman

## Project Structure

```text
Spring-CRUD-Application
└── src
    └── main
        ├── java
        │   └── com.springcrud
        │       ├── SpringCrudApplication.java
        │       ├── controller
        │       │   └── EmployeeController.java
        │       ├── entity
        │       │   └── Employee.java
        │       ├── repository
        │       │   └── EmployeeRepository.java
        │       └── service
        │           └── EmployeeService.java
        │
        └── resources
            └── application.properties

## Database

Database used: springcrud

The employee table is created automatically by Hibernate/JPA when the application runs.

## Running the Application

1. Configure MySQL credentials in application.properties.
2. Create the springcrud database.
3. Run SpringCrudApplication.java.
4. The application runs on: http://localhost:8082
5. Use Postman to test the REST APIs.

## Author

**Vaibhavi Parmar**
