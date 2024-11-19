CREATE TABLE IF NOT EXISTS lead (
    lead_id BIGSERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL UNIQUE,
    status VARCHAR(50) DEFAULT 'active', -- Activo, cerrado, etc.
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    customer_id BIGINT, -- Relación opcional con customer
    FOREIGN KEY (customer_id) REFERENCES customer(id) ON DELETE SET NULL
    );
