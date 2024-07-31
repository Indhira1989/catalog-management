# Catalog Management System

## Project Description

The Catalog Management System is a RESTful API developed with Spring Boot and PostgreSQL. This application allows users to manage a catalog of products. It supports basic CRUD (Create, Read, Update, Delete) operations for products in the catalog. This project demonstrates the use of Spring Boot for building RESTful services and PostgreSQL for managing relational data.

## Features

- **Product Management**: Perform CRUD operations on product records.
  - **Create**: Add new products to the catalog.
  - **Read**: Retrieve information about products.
  - **Update**: Modify existing product details.
  - **Delete**: Remove products from the catalog.
- **Database Integration**: Utilizes PostgreSQL for storing product data.
- **Spring Boot**: Leverages Spring Boot for building and running the application.
- **RESTful API**: Exposes endpoints for interacting with the catalog.

## Setup Instructions

### Prerequisites

- **Java**: JDK 11 or higher
- **Maven**: Build tool for managing dependencies
- **PostgreSQL**: Installed and running
- **Spring Tool Suite (STS)**: IDE (optional but recommended)

### Installation

1. **Clone the Repository**

   ```bash
   git clone https://github.com/yourusername/catalog-management.git
   cd catalog-management

   Configure PostgreSQL

Create a PostgreSQL database named catalog_db (or use an existing one).

Update the application.properties file with your PostgreSQL credentials:

properties
Copy code
spring.datasource.url=jdbc:postgresql://localhost:5432/catalog_db
spring.datasource.username=postgres
spring.datasource.password=admin
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
Build the Project

bash
Copy code
mvn clean install
Run the Application

bash
Copy code
mvn spring-boot:run
The application will start and be available at http://localhost:8080.

API Documentation
Base URL
http://localhost:8080/api/products

Endpoints
Get All Products

http
Copy code
GET /api/products
Response

json
Copy code
[
    {
        "id": 1,
        "name": "Product Name",
        "description": "Product Description",
        "price": 99.99
    }
]
Get Product by ID

http
Copy code
GET /api/products/{id}
Response

json
Copy code
{
    "id": 1,
    "name": "Product Name",
    "description": "Product Description",
    "price": 99.99
}
Create New Product

http
Copy code
POST /api/products
Request Body

json
Copy code
{
    "name": "New Product",
    "description": "Product Description",
    "price": 49.99
}
Response

json
Copy code
{
    "id": 2,
    "name": "New Product",
    "description": "Product Description",
    "price": 49.99
}
Update Product

http
Copy code
PUT /api/products/{id}
Request Body

json
Copy code
{
    "name": "Updated Product",
    "description": "Updated Description",
    "price": 59.99
}
Response

json
Copy code
{
    "id": 1,
    "name": "Updated Product",
    "description": "Updated Description",
    "price": 59.99
}
Delete Product

http
Copy code
DELETE /api/products/{id}
Response

json
Copy code
{
    "status": "Product deleted"
}
License
This project is licensed under the MIT License - see the LICENSE file for details.

Contact
For any questions or feedback, please reach out to indharjo@gmail.com.


This README provides a clear overview of the project, setup instructions, and API documentation, making it easier for others to understand and use your application.
