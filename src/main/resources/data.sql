DROP TABLE IF EXISTS billionaires;

CREATE TABLE Item (
  itemId INT AUTO_INCREMENT  PRIMARY KEY,
  itemName VARCHAR(250) NOT NULL,
  itemEnteredByUser VARCHAR(250) NOT NULL,
  TIMESTAMP
  career VARCHAR(250) DEFAULT NULL,
);

INSERT INTO billionaires (first_name, last_name, career) VALUES
  ('Aliko', 'Dangote', 'Billionaire Industrialist'),
  ('Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
  ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate');