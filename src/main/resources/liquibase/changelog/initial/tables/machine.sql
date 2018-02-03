CREATE TABLE machine (
	machine_id BIGINT NOT NULL,
	machine_name VARCHAR(255) NOT NULL,
	PRIMARY KEY (machine_id))
	ENGINE = INNODB
	DEFAULT CHARSET = utf8;