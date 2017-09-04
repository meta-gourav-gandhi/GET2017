USE Library_Management_System;

CREATE TABLE Members(
    member_id INT NOT NULL AUTO_INCREMENT,
    member_name VARCHAR(20),
    addressline1 VARCHAR(20),
    addressline2 VARCHAR(20),
    category VARCHAR(20),
    PRIMARY KEY (member_id)
);

