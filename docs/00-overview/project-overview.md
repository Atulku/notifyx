# NotifyX - Project Overview

## Version

| Version | Date | Author | Status |
|----------|------|--------|--------|
| 1.0 | 15-Jul-2026 | Atul Kumar | Draft |

---

# Overview

NotifyX is a production-grade, event-driven notification platform that enables enterprise applications to send notifications through multiple communication channels using a unified API.

Instead of every application integrating separately with Email, SMS, Push, WhatsApp, Slack, or future providers, applications interact only with NotifyX.

NotifyX is responsible for routing, processing, retrying, monitoring, auditing, and tracking notifications.

---

# Vision

Build a scalable and highly available notification platform capable of processing millions of notifications per day while maintaining reliability, observability, and extensibility.

---

# Business Problem

Large organizations have many applications:

- Order Service
- Payment Service
- HR System
- Inventory System
- CRM
- Banking Applications

Each application needs to send notifications.

Without a centralized platform:

- Duplicate code
- Inconsistent templates
- No retry mechanism
- Difficult monitoring
- Tight coupling with providers

NotifyX solves these challenges.

---

# Objectives

- Provide a single Notification API
- Support multiple notification channels
- Decouple applications from providers
- Support asynchronous processing
- Enable fault tolerance
- Improve scalability
- Provide centralized monitoring
- Simplify future integrations

---

# Initial Scope (MVP)

Supported Channels

- Email
- SMS (Mock)
- Push (Mock)

Core Features

- REST API
- Kafka-based processing
- Retry mechanism
- Dead Letter Queue
- Notification status tracking
- Monitoring
- Audit logging

---

# Out of Scope (MVP)

- WhatsApp
- Slack
- Webhooks
- Multi-region deployment
- Multi-tenancy
- AI-based channel selection

---

# Technology Stack

| Layer | Technology |
|---------|------------|
| Language | Java 21 |
| Framework | Spring Boot 3 |
| Build Tool | Maven |
| Messaging | Apache Kafka |
| Database | PostgreSQL |
| Cache | Redis |
| Container | Docker |
| Orchestration | Kubernetes |
| Monitoring | Prometheus |
| Dashboard | Grafana |
| Tracing | OpenTelemetry + Jaeger |

---

# Repository Structure

```
notifyx
│
├── docs
├── services
├── docker
├── kubernetes
├── scripts
└── architecture
```

---

# Project Status

Current Phase

> Requirements & Architecture Design