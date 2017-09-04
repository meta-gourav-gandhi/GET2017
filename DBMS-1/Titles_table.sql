CREATE TABLE Titles(
    title_id INT NOT NULL AUTO_INCREMENT,
    title_name VARCHAR(20),
    subject_id INT NOT NULL,
    publisher_id INT NOT NULL,
    PRIMARY KEY (title_id),
    CONSTRAINT fk_subject_id FOREIGN KEY (subject_id) REFERENCES Subjects(subject_id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT fk_publisher_id FOREIGN KEY (publisher_id) REFERENCES Publishers(publisher_id) ON DELETE CASCADE ON UPDATE CASCADE
);