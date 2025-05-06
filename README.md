# 🏥 Healthcare Microservices Platform

A demonstration project based on microservices architecture for managing patients, billing, and analytics within a healthcare system. The system is composed of several collaborating services: `patient-service`, `billing-service`, `analytics-service`, `auth-service`, and an `api-gateway`.

## 🚀 Technologies Used

### Backend
- **Java 17**
- **Spring Boot 3**
- **Spring Security (JWT)**
- **Spring Validation**
- **gRPC**
- **Apache Kafka**
- **PostgreSQL** (per service)
- **Docker & Docker Compose**

### Communication
- **gRPC** – Synchronous service-to-service communication (`patient-service` ↔ `billing-service`)
- **Kafka** – Asynchronous/event-driven messaging (`patient-service` → `analytics-service`)

### Authentication & Authorization
- **JWT Token-Based Authentication**
- **Auth Service** as central authentication microservice
- **API Gateway** with JWT verification and request filtering

### Documentation
- **SpringDoc OpenAPI**
- Exposed via **API Gateway**

### DevOps & Deployment
- **Docker / Docker Compose**
- **AWS LocalStack (for local testing)**
- **AWS CloudFormation (Infrastructure as Code)**
- **ECS, VPC, MSK, RDS, Application Load Balancer**

## 🧱 Microservice Overview

- `patient-service` – Patient CRUD, data validation, gRPC client, Kafka producer
- `billing-service` – Billing management, gRPC server
- `analytics-service` – Kafka consumer for patient-related events
- `auth-service` – User management and authentication (JWT, Spring Security)
- `api-gateway` – Entry point for external requests with routing, security, and documentation

## 🧪 Testing

- Unit and integration testing for controllers and services
- Token validation and secured endpoint testing

## ☁️ Infrastructure (CloudFormation IaC)

- Creates:
  - VPC
  - Databases (RDS)
  - Kafka cluster (MSK)
  - ECS clusters and services
  - Load balancer (ALB)
- Docker images deployed to LocalStack or AWS

## ✅ Completed Features

- [x] User creation and login
- [x] JWT validation via API Gateway
- [x] Patient CRUD with validation
- [x] Centralized error and exception handling
- [x] gRPC communication between services
- [x] Kafka integration (producer and consumer)
- [x] Full Dockerization of services
- [x] Infrastructure-as-Code with AWS CloudFormation
