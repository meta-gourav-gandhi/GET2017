# command to remove Members table of the LIS database.

ALTER TABLE book_issue DROP FOREIGN KEY fk_issue_member_id;
ALTER TABLE book_return DROP FOREIGN KEY fk_return_member_id;

DROP TABLE members;



#creating member table id

CREATE TABLE Members(
    member_id INT NOT NULL AUTO_INCREMENT,
    member_name VARCHAR(20),
    addressline1 VARCHAR(20),
    addressline2 VARCHAR(20),
    category VARCHAR(20),
    PRIMARY KEY (member_id)
);


ALTER TABLE book_issue
ADD CONSTRAINT fk_issue_member_id
FOREIGN KEY (member_id) REFERENCES members(member_id);

ALTER TABLE book_return
ADD CONSTRAINT fk_return_member_id
FOREIGN KEY (member_id) REFERENCES members(member_id);
