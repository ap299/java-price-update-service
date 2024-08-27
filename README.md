# java-price-update-service
Digital Product Management System - Java Service

Features

Price Updates: Processes requests to update product prices.
Spring Boot: Simplifies the development of Java-based applications.
Technologies Used

Java
Spring Boot
MongoDB (through Node.js API)
Getting Started

Prerequisites
Java Development Kit (JDK) installed on your system
MongoDB installed and running
Installation
Clone the repository:
https://github.com/ap299/digital-product-management.git
cd digital-product-management

Set up MongoDB connection:
Update the application.properties file with the MongoDB connection details if needed.

Run the Java service:
Open the project in your preferred IDE (like IntelliJ IDEA or Eclipse).
Run the PriceUpdateServiceApplication class to start the service.

Endpoints
POST /updatePrice: Receives price update requests and processes them.
Example Request
Update Product Price
 POST http://localhost:8080/updatePrice -H "Content-Type: application/json" -d '{
  "productId": "ProducrID",
  "newPrice": Price(int)
}'
Error Handling
404 Not Found: When the product is not found.
400 Bad Request: When input data is invalid (e.g., negative price).

Future Improvements
Authentication: Adding JWT-based authentication to secure the service.
Validation: Adding more robust validation for the price update requests.

