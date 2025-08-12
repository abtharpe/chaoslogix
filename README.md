# Chaoslogix - Delivery Order Management System

Chaoslogix is a logistics-oriented web application designed to manage intercity delivery orders for depots and customers. It is currently under active development as a backend-driven solution using **Java**, **Spring Boot**, **Thymeleaf**, and an **H2 in-memory database**.

---

## Project Goals

The purpose of this application is to:

- Centralize order intake for long-distance shipments
- Support routing logic for multi-stop deliveries (e.g., "Coastal Loads")
- Track pallet counts, order status, and principal-specific billing
- Build a foundation for full dispatch and logistics management (truck, driver, loads, depots, etc.)
- Gain real-world backend engineering experience with Spring Boot and modern Java practices

---

## Current Features

- Create new delivery orders via a web form
- View all active orders (dynamically pulled from the database)
- Backend wired via Spring MVC with controller-service-repo architecture
- Persistence using JPA and an H2 in-memory database
- Thymeleaf used for dynamic rendering of views

---

## How to Use (Development)

1. **Run the Spring Boot App**
   - Open in your IDE or terminal
   - Run `ChaoslogixApplication.java`

2. **Visit the Web App**
   - Navigate to: [http://localhost:8080](http://localhost:8080)

3. **Create a New Order**
   - Fill out the order form
   - Submit to add it to the order list

4. **View Existing Orders**
   - Orders appear in the table below the form
   - Newest entries appear with timestamp, status, type, etc.

---

## Next Steps / To-Do

- Implement entity relationships (Load → Order, Truck, Depot, etc.)
- Add form validation and error handling
- Replace H2 with PostgreSQL for persistent storage
- Add authentication and role-based access
- Build out dispatching and routing logic

---

## Tech Stack

- Java 17
- Spring Boot 3.5
- Spring Data JPA
- Thymeleaf
- H2 Database
- Maven

---

## Author

Brock Tharpe
Aspiring Software Engineer  
