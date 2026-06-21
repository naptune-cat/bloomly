# 🌸 Bloomly

Bloomly is a secure and user-friendly journaling application designed to help users capture their thoughts, reflect on their experiences, and track their moods over time. The application provides a personal digital space where users can create, manage, and organize journal entries while maintaining privacy through authentication and authorization mechanisms.

## Features

* User Registration and Login
* JWT-Based Authentication and Authorization
* Create Journal Entries
* View Personal Journal Entries
* Update Existing Entries
* Delete Journal Entries
* Mood Tracking with Each Journal Entry
* Secure Password Encryption
* RESTful API Architecture

## Tech Stack

### Backend

* Java 17
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate
* JWT Authentication
* Lombok
* Maven

### Database

* PostgreSQL

## Project Structure

```text
src
├── main
│   ├── java
│   │   └── com.bloomly
│   │       ├── controller
│   │       ├── service
│   │       ├── repository
│   │       ├── entity
│   │       ├── dto
│   │       ├── security
│   │       ├── exception
│   │       └── config
│   └── resources
│       ├── application.properties
│       └── static
```

## Database Design

### User Entity

| Field    | Type   |
| -------- | ------ |
| id       | Long   |
| username | String |
| email    | String |
| password | String |

### Journal Entity

| Field     | Type          |
| --------- | ------------- |
| id        | Long          |
| title     | String        |
| content   | Text          |
| mood      | Enum          |
| createdAt | LocalDateTime |
| user      | User          |

### Mood Enum

```java
HAPPY,
SAD,
EXCITED,
CALM,
ANGRY,
ANXIOUS,
MOTIVATED
```

## API Endpoints

### Authentication APIs

| Method | Endpoint           | Description         |
| ------ | ------------------ | ------------------- |
| POST   | /api/auth/register | Register a new user |
| POST   | /api/auth/login    | Authenticate user   |

### Journal APIs

| Method | Endpoint           | Description                  |
| ------ | ------------------ | ---------------------------- |
| POST   | /api/journals      | Create a journal entry       |
| GET    | /api/journals      | Retrieve all journal entries |
| GET    | /api/journals/{id} | Retrieve journal by ID       |
| PUT    | /api/journals/{id} | Update a journal entry       |
| DELETE | /api/journals/{id} | Delete a journal entry       |

## Getting Started

### Prerequisites

* Java 17 or higher
* PostgreSQL
* Maven

### Clone the Repository

```bash
git clone https://github.com/your-username/bloomly.git
cd bloomly
```

### Create Database

```sql
CREATE DATABASE bloomly;
```

### Configure Application

Update the `application.properties` file:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/bloomly
spring.datasource.username=postgres
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Run the Application

```bash
mvn spring-boot:run
```

The application will be available at:

```text
http://localhost:8080
```

## Security

Bloomly uses Spring Security and JWT Authentication to protect API endpoints. Passwords are encrypted before storage, ensuring user data remains secure.

## Future Enhancements

* Mood Analytics Dashboard
* Journal Search and Filtering
* Daily Journal Reminders
* Journal Categories and Tags
* Image Attachments
* PDF Export Functionality
* Dark Mode Support
* Swagger/OpenAPI Documentation

## 📚 Learning Outcomes

This project helped in understanding:

* Spring Boot Application Development
* RESTful API Design
* PostgreSQL Integration
* JPA and Hibernate ORM
* DTO Pattern Implementation
* JWT Authentication
* Exception Handling
* Layered Architecture
* Secure Backend Development

## Author

**Zoya Khanam**

---

*"Write your thoughts, track your emotions, and bloom every day with Bloomly."* 🌸
