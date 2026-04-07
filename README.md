# Evaluacion3 Backend

Evaluacion3 Backend is a small Spring Boot sales service created to support an Android application with basic REST endpoints for sales registration and payment state updates. I keep it as a cleaned-up academic backend example that shows incremental progress toward more structured service development.

## What The Service Does

- list all sales records
- create new sales
- delete sales by id
- mark a sale as paid
- run locally with an H2 in-memory database

## Tech Stack

- Java 17
- Spring Boot 3.3
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## API Endpoints

Base URL: `http://localhost:8081`

- `GET /api/ventas`
- `POST /api/ventas`
- `DELETE /api/ventas/{id}`
- `PUT /api/ventas/{id}/pagar`

## Local Run

Prerequisites:

- Java 17+
- Maven 3.8+

Commands:

```bash
mvn clean test
mvn spring-boot:run
```

Useful URLs:

- API base URL: `http://localhost:8081`
- H2 Console: `http://localhost:8081/h2-console`

## Portfolio Context

This is a simpler project than my more mature backend repositories, but it still shows a useful part of my learning path: taking an academic requirement and shaping it into a repository that is cleaner, easier to understand, and more presentable for recruiters.

## Future Improvements

- request validation
- DTOs instead of returning entities directly
- exception handling
- automated tests
- Docker support

## License

This project is licensed under the MIT License.
