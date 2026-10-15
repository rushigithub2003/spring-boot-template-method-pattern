# Document Processing System — Template Method Design Pattern

A Spring Boot project demonstrating the **Template Method Design Pattern** through a document processing system. The project aims to reduce code duplication by defining a common processing workflow in an abstract class while allowing subclasses to implement document-specific operations.

## Features

- Demonstrates the Template Method Design Pattern.
- Uses an abstract class to define a common document processing workflow.
- Supports PDF, Excel, and Word document processing.
- Promotes code reusability and separation of responsibilities.
- Exposes REST APIs using Spring Boot.
- Demonstrates object-oriented programming concepts in Java.

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Maven
- REST API
- Template Method Design Pattern

## Design Pattern Overview

The Template Method Design Pattern defines the skeleton of an algorithm in a method, allowing subclasses to customize specific steps without changing the overall algorithm structure.

In this project, the common document processing steps are defined in an abstract class, while subclasses provide document-specific implementations.

### Processing Workflow

1. Read data.
2. Process data.
3. Generate or print the document.

The overall processing sequence remains consistent, while individual steps can differ according to the document type.

## Supported Document Types

| Document Type | Purpose                 |
| ------------- | ----------------------- |
| PDF           | Process PDF documents   |
| Excel         | Process Excel documents |
| Word          | Process Word documents  |

> Note: The project demonstrates document processing logic. Actual PDF, Excel, or Word file generation depends on the implementation.

## Project Structure

```text
document-processing-system-using-tdp/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/documentprocessing/
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── DocumentProcessingSystemApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```
