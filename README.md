# Container Routing API

Author: **Durga Prasad Abbana**

## Overview
This project is a backend service that handles container movement optimization in a port based on real-world port constraints.

It includes:
- A Spring Boot API to receive container move requests.
- An optimization service to generate container move responses.
- Concurrent system design for handling heavy traffic.

## Directory Structure

.
src-> main-> java-> com -> model-> ContainerMoveRequest.java
->ContainerMoveResponse.java

src-> main-> java-> com -> ContainerRoutingApiApplication.java
-> ContainerRoutingController.java
-> OptimizationService.java
-> resources
-> application.properties
-> pom.xml
-> Task1_Documentation.md

## How to Run

### Prerequisites
- Java 17+
- Maven 3.8+
- VS Code / IntelliJ IDEA

## Steps
1. Clone the repository.
2. Navigate to project root.
3. Run:
        mvn clean install
        mvn spring-boot:run

### Main Files
- ContainerMoveRequest.java - Request file
- ContainerMoveResponse.java - Response file
- ContainerRoutingController.java - REST controller file
- OptimizationService.java - Service class file

----------------------------------------------------------------------

# Task 2: Concurrent System Design

## High-Level System Architecture

**Components:**
- Load Balancer (e.g., AWS ELB)
- Cache Layer (e.g., Redis)
- Application Layer (Spring Boot Containers)
- Database (PostgreSQL)
- Monitoring Tools (e.g., Prometheus + Grafana)

### Diagram 
Task 2: Concurrent System Design

### Key Points
- **Load Balancer** distributes incoming traffic.
- **Redis Cache** for frequently accessed optimization results.
- **Database** stores all container movements.
- **Horizontal Scaling** of Spring Boot instances to handle load.

- **Failure Handling:**
  - Health checks on instances.
  - Auto-scaling if CPU/Memory thresholds exceed.
  - Graceful degradation using fallback mechanisms.


# Conclusion
This backend solution is designed to be highly scalable, responsive, and production-ready for real-world port optimization scenarios.


# Author
**Durga Prasad Abbana**


# License
Open-source for learning and demonstration purposes.

