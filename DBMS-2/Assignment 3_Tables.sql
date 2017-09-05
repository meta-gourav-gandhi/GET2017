CREATE DATABASE City_Database;

#creating state table 
CREATE TABLE State(
    state_code INT,
    state_name VARCHAR(25),
    PRIMARY KEY (state_code)
);

#creating city table 
CREATE TABLE City(
    zip_code INT,
    city_name VARCHAR(25),
    state_code INT,
    PRIMARY KEY (zip_code),
    CONSTRAINT fk_state_code FOREIGN KEY (state_code) REFERENCES State (state_code) 
);



