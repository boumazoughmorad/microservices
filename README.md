# Microservices-Based System for Customer Management and Fraud Detection with Real-Time Notifications

## Overview
This project follows a microservices architecture designed to manage customers, detect fraud, and provide real-time notifications to users. It uses technologies like Spring Boot, Eureka Service Discovery, Docker, and Spring Security to create a scalable, secure, and efficient system.

## Key Features:
- **Microservices Architecture**: Composed of independent services like customer management, fraud detection, and notifications.
- **Eureka Service Discovery**: Ensures dynamic service registration and communication.
- **Real-Time Notifications**: Sends alerts and updates to users.
- **Dockerized Services**: Simplifies deployment and ensures consistent environments.
- **Spring Security**: Provides authentication and authorization for each service.

## Technologies Used:
- **Spring Boot**
- **Eureka Service Discovery**
- **Docker**
- **Spring Security**

## Installation

### Clone the repository:
```sh
git clone https://github.com/your-username/project-name.git
cd project-name
```

###Build the project using Maven:
```sh
mvn clean install

```

###Run the project locally:
```sh
mvn spring-boot:run


```

###Using Docker:
You can containerize and run the services using Docker Compose. First, build the Docker images:

```sh
docker-compose build

```
Then, start the services:
```sh
docker-compose up

```
