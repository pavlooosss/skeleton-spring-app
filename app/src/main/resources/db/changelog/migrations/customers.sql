--liquibase formatted sql

--changeset create_customer_table
CREATE TABLE customer (
    id        bigserial PRIMARY KEY,
    name       varchar(50) NOT NULL,
    created_at timestamp NOT NULL
);