# API Design

## Authentication

### Register User

POST /api/v1/auth/register

Request

```json
{
  "name": "Dhruv Kumar",
  "email": "dhruv@example.com",
  "password": "password123"
}
```

Response

```json
{
  "message": "User registered successfully"
}
```

---

### Login

POST /api/v1/auth/login

Request

```json
{
  "email": "dhruv@example.com",
  "password": "password123"
}
```

Response

```json
{
  "token": "JWT_TOKEN",
  "role": "ADMIN"
}
```

## Traffic

### Get All Traffic Signals

GET /api/v1/traffic/signals

### Get Traffic Signal By ID

GET /api/v1/traffic/signals/{id}

### Update Traffic Signal

PUT /api/v1/traffic/signals/{id}

Request

```json
{
  "signalState": "GREEN",
  "greenTime": 45
}
```

## Parking

### Get Parking Lots

GET /api/v1/parking/lots

### Get Available Slots

GET /api/v1/parking/lots/{id}/slots

### Reserve Parking

POST /api/v1/parking/reservations

Request

```json
{
  "userId": 1,
  "slotId": 5
}
```

## Vehicles

### Get All Vehicles

GET /api/v1/vehicles

### Get Vehicle By ID

GET /api/v1/vehicles/{id}

## Emergency

### Get Emergency Vehicles

GET /api/v1/emergency

### Activate Green Corridor

POST /api/v1/emergency/green-corridor

## Notifications

### Get User Notifications

GET /api/v1/notifications/{userId}

### Send Notification

POST /api/v1/notifications

## Analytics

### Traffic Report

GET /api/v1/analytics/traffic

### Parking Report

GET /api/v1/analytics/parking