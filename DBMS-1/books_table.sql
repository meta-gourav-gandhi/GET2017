CREATE TABLE Books(
    accession_no INT NOT NULL AUTO_INCREMENT,
    title_id INT,
    purchase_date TIMESTAMP,
    price DOUBLE,
    status VARCHAR(20),
    PRIMARY KEY(accession_no),
    CONSTRAINT fk_books_title_id FOREIGN KEY (title_id) REFERENCES Titles(title_id) ON DELETE CASCADE ON UPDATE CASCADE
);