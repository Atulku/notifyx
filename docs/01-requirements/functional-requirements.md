# Functional Requirements

## Purpose

This document defines the functional capabilities that NotifyX must provide.

---

# Actors

1. Client Applications
2. System Administrator
3. Notification Workers

---

# FR-001 Submit Notification

Priority: High

Description

Applications shall be able to submit a notification request using a REST API.

Acceptance Criteria

- API accepts request
- Notification ID generated
- Kafka event published
- HTTP 202 Accepted returned

---

# FR-002 Multi-Channel Notifications

Supported Channels

- Email
- SMS
- Push

Future

- WhatsApp
- Slack
- Webhook

---

# FR-003 Template Management

System shall support

- Create Template
- Update Template
- Delete Template
- Version Templates

---

# FR-004 Dynamic Variables

Templates shall support placeholders.

Example

Hello {{name}}

---

# FR-005 Notification Status

Statuses

- RECEIVED
- PENDING
- PROCESSING
- SENT
- FAILED
- RETRYING
- DELIVERED
- EXPIRED

---

# FR-006 Retry

Retry failed notifications using configurable retry policy.

---

# FR-007 Dead Letter Queue

Failed messages after maximum retry count shall be sent to DLQ.

---

# FR-008 Query Notification

Users shall retrieve notification status.

GET /notifications/{id}

---

# FR-009 Audit Logging

Every request shall be audited.

---

# FR-010 Scheduled Notifications

Support scheduling for future delivery.

---

# FR-011 Bulk Notifications

Support sending notifications to multiple recipients.

---

# FR-012 User Preferences

Respect communication preferences.

Example

Email : Enabled

SMS : Disabled

Push : Enabled

---

# FR-013 Priority

Support

- HIGH
- MEDIUM
- LOW

---

# FR-014 Authentication

Secure APIs using JWT.

---

# FR-015 Monitoring

Expose

- Health
- Metrics
- Prometheus endpoint