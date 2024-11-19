CREATE TABLE IF NOT EXISTS activity (
    activity_id BIGSERIAL PRIMARY KEY,
    lead_id BIGINT NOT NULL,
    description TEXT NOT NULL, -- Cambiado a TEXT si necesitas descripciones más largas
    activity_type VARCHAR(50), -- Por ejemplo: llamada, reunión, email
    activity_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (lead_id) REFERENCES lead(lead_id) ON DELETE CASCADE
    );
