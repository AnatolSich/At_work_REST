DROP TABLE IF EXISTS contact;
DROP SEQUENCE IF EXISTS glob_seq;

CREATE SEQUENCE glob_seq START 1000;

CREATE TABLE contact
(
  id   INTEGER PRIMARY KEY DEFAULT nextval('glob_seq'),
  name VARCHAR NOT NULL
);

INSERT INTO contact(name) VALUES
  ('Anton'),
  ('Vlad'),
  ('Serj'),
  ('Miha'),
  ('Adron');
