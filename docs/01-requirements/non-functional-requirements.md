# Assumptions and Constraints

---

# Assumptions

## Infrastructure

- Kafka cluster is available.
- PostgreSQL is available.
- Redis is available.
- Docker Desktop is installed.
- Kubernetes (Kind) is available for local deployments.

---

## Development

- Java 21 will be used.
- Maven will be the build tool.
- Spring Boot 3 will be be used.
- GitHub will host source code.
- GitHub Actions will be used for CI/CD.

---

## Notification Providers

For MVP

- Email will use MailHog.
- SMS will be mocked.
- Push will be mocked.

Real providers will be integrated later.

---

## Security

JWT authentication will be implemented after the core notification flow is complete.

---

# Constraints

## MVP Constraints

- Local deployment only.
- Single Kubernetes cluster.
- No cloud deployment.
- No multi-region support.

---

## Technical Constraints

- Event-driven architecture using Kafka.
- PostgreSQL as primary database.
- Redis for caching and idempotency.
- REST APIs for synchronous communication.

---

## Scope Constraints

The following are excluded from MVP.

- WhatsApp
- Slack
- Microsoft Teams
- AI-based routing
- Multi-tenancy
- Multi-cloud deployment
- Disaster recovery automation

---

# Risks

| Risk | Mitigation |
|------|------------|
| Kafka unavailable | Local Docker Compose |
| Provider failure | Retry + DLQ |
| Database downtime | Persistent storage + retries |
| Duplicate messages | Idempotency |

---

# Future Enhancements

- Twilio Integration
- Firebase Cloud Messaging
- SendGrid
- AWS SES
- AWS SNS
- Multi-region deployment
- Multi-tenancy
- Auto Scaling