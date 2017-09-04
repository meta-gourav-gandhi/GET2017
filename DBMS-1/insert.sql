
######## Insert in members
INSERT INTO members (member_name,addressline1,addressline2,category)   VALUES ("Gourav","Sitapura","DPR","Permanent") ;
INSERT INTO members (member_name,addressline1,addressline2,category)   VALUES ("Gandhi","new Colony","KOTA","Permanent") ;
INSERT INTO members (member_name,addressline1,addressline2,category)   VALUES ("manan","civil lines","Jaipur","Permanent") ;


######## Insert in publisher
INSERT INTO publishers (publisher_name)   VALUES ("Raj") ;
INSERT INTO publishers (publisher_name)   VALUES ("Rohit") ;

######## Insert in authors

INSERT INTO authors (author_name)   VALUES ("Jon") ;
INSERT INTO authors (author_name)   VALUES ("Tyrion") ;

######## Insert in Subject

INSERT INTO subjects (subject_name)   VALUES ("Horror") ;
INSERT INTO subjects (subject_name)   VALUES ("Romance") ;

######## Insert in title

INSERT INTO titles (title_name,subject_id,publisher_id)   VALUES ("Gone Girl","1","2") ;
INSERT INTO titles (title_name,subject_id,publisher_id)   VALUES ("Black Beauty","2","1") ;
INSERT INTO titles (title_name,subject_id,publisher_id)   VALUES ("GOT","1","2") ;


######## Insert in title_authors

INSERT INTO title_author (title_id,author_id)   VALUES ("1","2") ;
INSERT INTO title_author (title_id,author_id)   VALUES ("2","1") ;
INSERT INTO title_author (title_id,author_id)   VALUES ("1","1") ;


######## Insert in books

INSERT INTO books (title_id,price,status)   VALUES ("1","250.90","Available") ;
INSERT INTO books (title_id,price,status)   VALUES ("1","250.90","Available") ;
INSERT INTO books (title_id,price,status)   VALUES ("2","550","Not Available") ;
INSERT INTO books (title_id,price,status)   VALUES ("3","1250","Available") ;


######## Insert in books_issue

INSERT INTO book_issue (accession_no,member_id)   VALUES ("1","3") ;
INSERT INTO book_issue (accession_no,member_id)   VALUES ("3","1") ;
INSERT INTO book_issue (accession_no,member_id)   VALUES ("2","2") ;

######## Insert in books_return

INSERT INTO book_return (accession_no,member_id,issue_date) SELECT accession_no,member_id,issue_date 
FROM book_issue WHERE accession_no="1" and member_id="3";

INSERT INTO book_return (accession_no,member_id,issue_date) SELECT accession_no,member_id,issue_date 
FROM book_issue WHERE accession_no="3" and member_id="1";


