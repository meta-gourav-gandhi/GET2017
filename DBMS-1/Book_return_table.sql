
CREATE TABLE Book_return(
    return_date TIMESTAMP,
    accession_no INT,
    member_id INT,
    issue_date TIMESTAMP,
    PRIMARY KEY (return_date,accession_no,member_id),
    CONSTRAINT fk_return_accession_no FOREIGN KEY(accession_no) REFERENCES Books(accession_no) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT fk_return_member_id FOREIGN KEY(member_id) REFERENCES Members(member_id) ON DELETE CASCADE ON UPDATE CASCADE
);