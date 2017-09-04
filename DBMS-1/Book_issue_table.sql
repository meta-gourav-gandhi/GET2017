CREATE TABLE Book_issue(
    issue_date TIMESTAMP,
    accession_no INT,
    member_id INT,
    due_date TIMESTAMP,
    PRIMARY KEY(issue_date,accession_no,member_id),
    CONSTRAINT fk_issue_accession_no FOREIGN KEY(accession_no) REFERENCES Books(accession_no) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT fk_issue_member_id FOREIGN KEY(member_id) REFERENCES Members(member_id) ON DELETE CASCADE ON UPDATE CASCADE
    
);