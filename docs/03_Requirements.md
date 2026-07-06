# System Architecture

## Overview

The Smart Urban Traffic & Parking Management System is a microservices-based application designed to monitor traffic, manage parking, provide real-time updates, and integrate AI for traffic prediction and optimization.

## High-Level Architecture

```
+------------------------------------------------------+
|                  React Web Dashboard                 |
+------------------------------------------------------+
                       |
                       |
                 API Gateway
                       |
 --------------------------------------------------------------
 |         |          |          |         |         |         |
Auth   Traffic   Parking   Vehicle   Emergency  Analytics  Notification
Service Service   Service    Service    Service     Service     Service
                       |
                 Kafka Event Bus
                       |
 --------------------------------------------------------------
 |                         |                                  |
 AI Service           PostgreSQL                         Redis
(Python/FastAPI)
```

## Components

### Frontend
- React + TypeScript
- Interactive dashboard
- Maps
- Live traffic updates

### API Gateway
- Single entry point
- Request routing
- Authentication validation

### Auth Service
- Login
- Registration
- JWT authentication
- Role management

### Traffic Service
- Road information
- Traffic signals
- Congestion monitoring

### Parking Service
- Parking lots
- Parking slots
- Reservations

### Vehicle Service
- Vehicle location
- Vehicle status
- GPS simulation

### Emergency Service
- Ambulance tracking
- Green corridor generation

### Analytics Service
- Reports
- Statistics
- Dashboards

### Notification Service
- Alerts
- Email notifications
- SMS (future)

### AI Service
- Traffic prediction
- Parking prediction
- Route optimization

## Database

- PostgreSQL for persistent data
- Redis for caching and real-time data

## Communication

- REST APIs
- WebSocket for live updates
- Kafka for event-driven communication