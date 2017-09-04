#Change value of addressLine2 column of Members table with “Jaipur”#

UPDATE members
SET addressline2="Jaipur";

#Change value of addressLine1 column of Members table with value 
#“EPIP, Sitapura” for the members belonging to category “F”.

UPDATE members
SET addressline1 = "EPIP, Sitapura"
WHERE category="F";

#Delete those rows of Titles table belonging to Publisher with publisher_id = 1

DELETE FROM Titles
WHERE publisher_id="1";


#Delete all the rows from Publishers table.
DELETE FROM publisher;

#Insert the sample data back in Publishers table using substitution variables.

SET @publisher_id1 = 1;
SET @publisher_nm1 = 'New Moon Books';
SET @publisher_id2 = 2;
SET @publisher_nm2 = 'Binnet & Harley';
INSERT INTO publishers(publisher_id, publisher_name) VALUES (@publisher_id1, @publisher_nm1), (@publisher_id2, @publisher_nm2);


