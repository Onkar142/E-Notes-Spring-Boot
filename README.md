# E-Notes – Notes Management Web Application

A web-based Notes Management Application built using **Java, Spring Boot, Spring Security, Thymeleaf, and MySQL**.

## Features

- User Registration and Login
- Secure authentication using Spring Security
- Create and manage personal notes
- View saved notes
- Edit existing notes
- Delete notes

## Technologies Used

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- Hibernate
- MySQL
- Thymeleaf
- HTML and CSS
- Maven

## Project Structure

```text
src/
 ├── main/
 │   ├── java/com/onkar/
 │   │   ├── config/
 │   │   ├── controller/
 │   │   ├── entity/
 │   │   ├── repository/
 │   │   └── service/
 │   └── resources/
 │       ├── static/
 │       └── templates/
 └── test/
```

## Prerequisites

- Java 19 or compatible version
- Maven
- MySQL Server

## Setup and Installation

1. Clone the repository:

```bash
git clone https://github.com/Onkar142/E-Notes-Spring-Boot.git
```

2. Open the project in your IDE.

3. Create a MySQL database named `enotes_db`.

4. Configure your local database credentials in `src/main/resources/application.properties`.

5. Run the application using Maven:

```bash
mvn spring-boot:run
```

6. Open your browser:

```text
http://localhost:8081
```

## Author

**Onkar**

GitHub: https://github.com/Onkar142
