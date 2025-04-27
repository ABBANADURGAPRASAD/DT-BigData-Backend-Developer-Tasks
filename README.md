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
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       ├── model
│       │       │   ├── ContainerMoveRequest.java
│       │       │   └── ContainerMoveResponse.java
│       │       ├── ContainerRoutingApiApplication.java
│       │       ├── ContainerRoutingController.java
│       │       └── OptimizationService.java
│       └── resources
│           └── application.properties
├── pom.xml
├── Task1_Documentation.md

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




