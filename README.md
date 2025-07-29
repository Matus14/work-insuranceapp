## Insurance Management Web App

A full-stack web application for managing insured clients, built using **Java Spring Boot**, **Thymeleaf**, and **MySQL**.  
Users can create, view, update, and delete client records via a simple web interface. 
This project demonstrates core backend development concepts including MVC architecture, JPA integration, and server-side templating.

## Technologies Used

- Java 17
- Spring Boot (MVC, Data JPA)
- Thymeleaf 
- MySQL 
- Bootstrap 5 (styling)
- Maven (project management)

## Features

-  Add new insured person
-  Edit existing person’s details
-  Delete person by ID
-  List all clients in a table view
-  Reusable layout using Thymeleaf fragments
-  Responsive UI with Bootstrap


## Project Structure

src/
└── main/
├── java/com/testing/matus/testing/
│ ├── controller/
│ │ └── InsurancePersonController.java
│ ├── entity/
│ │ └── InsurancePerson.java
│ ├── repository/
│ │ └── InsurancePersonRepository.java
│ ├── service/
│ │ └── InsurancePersonService.java
│ └── Application.java
└── resources/
├── templates/
│ ├── layout/
│ │ └── base.html
│ └── person/
│ ├── form.html
│ ├── edit.html
│ └── list.html
└── application.properties


## How It Works

| URL              | Description                | Template Used      |
|------------------|----------------------------|--------------------|
| `/`              | Add new person             | `form.html`        |
| `/list`          | View all clients           | `list.html`        |
| `/edit/{id}`     | Edit person by ID          | `edit.html`        |
| `/delete/{id}`   | Delete person by ID        | (redirects to list)|

Each template is wrapped with `base.html` layout using Thymeleaf `th:fragment`.


## Learning Objectives

- Implementing full CRUD with Spring Boot
- Structuring backend using layered architecture (controller, service, repository)
- Using JPA/Hibernate for persistence
- Server-side form binding with Thymeleaf (th:object, th:field)
- Working with layout fragments (th:fragment, th:replace)
- Styling UI using Bootstrap 5

## AUTHOR ## 
Created by Matúš Bučko as part of a full-stack Java development course and used as a portfolio project.
This application demonstrates key Spring Boot skills for entry-level backend developer roles.



