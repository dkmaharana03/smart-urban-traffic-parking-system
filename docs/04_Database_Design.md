# Database Design

## Overview

The Smart Urban Traffic & Parking Management System uses PostgreSQL as the primary relational database.
The database stores information about:
- Users
- Roads
- Junctions
- Traffic Signals
- Parking Lots
- Parking Slots
- Vehicles
- Traffic Events
- Parking Reservations
- Emergency Vehicles
- Notifications

## Users

| Column | Type |
|---------|------|
| id | UUID |
| name | VARCHAR |
| email | VARCHAR |
| password | VARCHAR |
| role | ENUM |
| created_at | TIMESTAMP |

## Roads

| Column | Type |
|---------|------|
| id | UUID |
| road_name | VARCHAR |
| length | DOUBLE |
| speed_limit | INTEGER |
| number_of_lanes | INTEGER |

## Junctions

| Column | Type |
|---------|------|
| id | UUID |
| junction_name | VARCHAR |
| latitude | DOUBLE |
| longitude | DOUBLE |

## Traffic Signals

| Column | Type |
|---------|------|
| id | UUID |
| junction_id | UUID |
| signal_state | ENUM |
| green_time | INTEGER |
| yellow_time | INTEGER |
| red_time | INTEGER |

## Parking Lots

| Column | Type |
|---------|------|
| id | UUID |
| name | VARCHAR |
| address | VARCHAR |
| capacity | INTEGER |
| available_slots | INTEGER |

## Parking Slots

| Column | Type |
|---------|------|
| id | UUID |
| parking_lot_id | UUID |
| slot_number | VARCHAR |
| status | ENUM |

## Vehicles

| Column | Type |
|---------|------|
| id | UUID |
| vehicle_number | VARCHAR |
| type | ENUM |
| latitude | DOUBLE |
| longitude | DOUBLE |
| speed | DOUBLE |

## Traffic Events

| Column | Type |
|---------|------|
| id | UUID |
| road_id | UUID |
| event_type | ENUM |
| severity | INTEGER |
| timestamp | TIMESTAMP |

## Parking Reservations

| Column | Type |
|---------|------|
| id | UUID |
| user_id | UUID |
| slot_id | UUID |
| start_time | TIMESTAMP |
| end_time | TIMESTAMP |

## Emergency Vehicles

| Column | Type |
|---------|------|
| id | UUID |
| vehicle_number | VARCHAR |
| type | ENUM |
| status | ENUM |
| latitude | DOUBLE |
| longitude | DOUBLE |

## Notifications

| Column | Type |
|---------|------|
| id | UUID |
| user_id | UUID |
| title | VARCHAR |
| message | TEXT |
| created_at | TIMESTAMP |

# Relationships

- One Junction has many Traffic Signals.
- One Parking Lot has many Parking Slots.
- One User can create many Parking Reservations.
- One Parking Slot can have many Reservations over time.
- One Road can have many Traffic Events.
- One User can receive many Notifications.