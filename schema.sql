CREATE TABLE IF NOT EXISTS tbl_product(
	id SERIAL PRIMARY KEY,
	name VARCHAR(255),
	description VARCHAR(255),
	price REAL,
	quantity INT
);
