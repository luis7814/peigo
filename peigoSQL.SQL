/*
Created: 10/01/2023
Modified: 10/01/2023
Model: PostgreSQL 12
Database: PostgreSQL 12
*/

-- Drop foreign keys (relationships) section ---------------------------------------------------

ALTER TABLE accounts DROP CONSTRAINT clients_account
;
ALTER TABLE transactions DROP CONSTRAINT clients_transaction
;
ALTER TABLE users DROP CONSTRAINT users_type_users
;

-- Drop keys section -------------------------------------------------

ALTER TABLE users_type DROP CONSTRAINT PK_users_type
;
ALTER TABLE users DROP CONSTRAINT PK_users
;
ALTER TABLE transactions DROP CONSTRAINT PK_transactions
;
ALTER TABLE accounts DROP CONSTRAINT PK_accounts
;

-- Drop indexes section -------------------------------------------------

DROP INDEX index_clients
;
DROP INDEX index_transaction
;
DROP INDEX index_users
;

-- Drop tables section ---------------------------------------------------

DROP TABLE users_type
;
DROP TABLE users
;
DROP TABLE transactions
;
DROP TABLE accounts
;

-- Create tables section -------------------------------------------------

-- Table accounts

CREATE TABLE accounts
(
  account_id Character varying NOT NULL,
  account_type Character varying,
  amount Double precision,
  user_id Character varying
)
WITH (
  autovacuum_enabled=true)
;

CREATE INDEX index_clients ON accounts (user_id)
;

ALTER TABLE accounts ADD CONSTRAINT PK_accounts PRIMARY KEY (account_id)
;

-- Table transactions

CREATE TABLE transactions
(
  transaction_id Character varying NOT NULL,
  origin_account Character varying,
  destination_account Character varying,
  amount_transaction Double precision,
  transaction_date Character varying,
  user_id Character varying
)
WITH (
  autovacuum_enabled=true)
;

CREATE INDEX index_transaction ON transactions (user_id)
;

ALTER TABLE transactions ADD CONSTRAINT PK_transactions PRIMARY KEY (transaction_id)
;

-- Table users

CREATE TABLE users
(
  user_id Character varying NOT NULL,
  name Character varying,
  password Character varying,
  user_type_id Character varying
)
WITH (
  autovacuum_enabled=true)
;

CREATE INDEX index_users ON users (user_type_id)
;

ALTER TABLE users ADD CONSTRAINT PK_users PRIMARY KEY (user_id)
;

-- Table users_type

CREATE TABLE users_type
(
  user_type_id Character varying NOT NULL,
  name Character varying,
  description Character varying
)
WITH (
  autovacuum_enabled=true)
;

ALTER TABLE users_type ADD CONSTRAINT PK_users_type PRIMARY KEY (user_type_id)
;

-- Create foreign keys (relationships) section -------------------------------------------------

ALTER TABLE accounts
  ADD CONSTRAINT clients_account
    FOREIGN KEY (user_id)
    REFERENCES users (user_id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
;

ALTER TABLE transactions
  ADD CONSTRAINT clients_transaction
    FOREIGN KEY (user_id)
    REFERENCES users (user_id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
;

ALTER TABLE users
  ADD CONSTRAINT users_type_users
    FOREIGN KEY (user_type_id)
    REFERENCES users_type (user_type_id)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
;

