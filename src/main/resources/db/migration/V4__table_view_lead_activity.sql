CREATE OR REPLACE VIEW lead_activity_view AS
SELECT
    l.lead_id AS leadId,
    l.name AS leadName,
    l.email AS leadEmail,
    a.activity_id AS activityId,
    a.description AS activityDescription,
    a.activity_date AS activityDate,
    c.id AS customerId,
    c.full_name AS customerName,
    c.email AS customerEmail
FROM
    lead l
        LEFT JOIN
    activity a ON l.lead_id = a.lead_id
        LEFT JOIN
    customer c ON c.id = l.lead_id;
