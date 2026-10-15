# Document Processing System — Template Method Design Pattern

A Java Spring Boot project demonstrating the **Template Method Design Pattern** through a document processing system supporting PDF, Excel, and Word document types.

The project uses an interface, an abstract class, and concrete implementations to demonstrate code reusability and method overriding. It also uses a factory class to create the appropriate document service based on the requested document type.

## Features

- Demonstrates the Template Method Design Pattern.
- Uses an interface to define a common document service contract.
- Uses an abstract class to implement common functionality.
- Reuses the `readDataFromDb()` method across document implementations.
- Supports PDF, Excel, and Word document processing.
- Uses a factory class to create document service objects.
- Exposes REST API endpoints using Spring Boot.

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Maven
- REST API
- Object-Oriented Programming (OOP)
- Template Method Design Pattern
- Factory Design Pattern

## Design Pattern Implementation

### 1. DocumentService

An interface that defines the common operations:

- `readDataFromDb()`
- `processData()`
- `printData()`

### 2. DocumentServiceAB

An abstract class that implements `DocumentService` and provides the common implementation of `readDataFromDb()`.

Concrete classes inherit this implementation instead of duplicating the same code.

### 3. Concrete Implementations

The following classes extend `DocumentServiceAB`:

- `PdfDocumentServiceImpl`
- `ExcelDocumentServiceImpl`
- `WordDocumentServiceImpl`

Each class implements its own `processData()` and `printData()` methods.

### 4. DocumentFactory

The factory class creates the appropriate document service based on the requested type.

### 5. DocumentController

The REST controller accepts the document type through a URL path variable and invokes the appropriate service methods.

## Processing Workflow

The application follows this sequence:

1. Receive a document type through a REST API request.
2. Create the appropriate service object using `DocumentFactory`.
3. Read data from the database (currently simulated using console output).
4. Process the data according to the document type.
5. Print the document processing message and return the response.

## API Endpoints

| HTTP Method | Endpoint       | Description               |
| ----------- | -------------- | ------------------------- |
| GET         | `/print/pdf`   | Process a PDF document    |
| GET         | `/print/excel` | Process an Excel document |
| GET         | `/print/word`  | Process a Word document   |

### Example Request

```http
GET http://localhost:8081/print/pdf
```
