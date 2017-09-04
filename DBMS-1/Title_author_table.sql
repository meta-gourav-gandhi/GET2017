CREATE TABLE Title_author(
    title_id INT NOT NULL,
    author_id INT,
    PRIMARY KEY(title_id,author_id),
    CONSTRAINT fk_title_author_title_id FOREIGN KEY (title_id) REFERENCES Titles(title_id) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT fk_author_id FOREIGN KEY (author_id) REFERENCES Authors(author_id) ON DELETE CASCADE ON UPDATE CASCADE
);