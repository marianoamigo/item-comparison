# Java + Spring Backend Challenge

This project implements a simplified REST API to manage items for a comparison feature.
The solution focuses on correctness, clarity, and strict alignment with the provided test cases.

The API behavior and responses are driven by the dynamic HTTP-based test provided by the challenge.

### Features

- Create new items
- Get individual items by their id
- Get all items
- Delete individual items by their id
- Delete all items

# How to run the APP

```console
mvn spring-boot:run

The application will start on port 8080.

```

# How to run the tests

```
mvn clean test

```


## Technical Stack

- Java: 21
- Springboot: 3.2.5
- Spring MVC
- Maven
- JUnit: 4 (done by HackerRank)
- MockMVC (also done by HackerRank)

## Decisions made

- The API behavior was implemented according to the HTTP scenarios defined in the provided test cases, ensuring full compatibility with the dynamic test runner.

- Data persistence was implemented in memory using a simple data structure, as no database was required by the challenge. This approach keeps the solution predictable and avoids unnecessary external dependencies.

- A simple layered structure (Controller -> Service) was chosen to keep the implementation clear and focused on the required functionality, avoiding over-engineering.

- Error handling was implemented to return the expected HTTP status codes (`400`, `404`) as defined by the test cases.


## Areas to improve

- Replace in-memory storage with persistent database, and a Repository label
- Add pagination and sorting to list endpoints
- Add OpenAPI / Swagger documentation
- Improve error responses structure
- Add concurrency handling for in-memory storage
- Introduce security if required by future use cases

