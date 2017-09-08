
#Ques:-1;
SELECT member_name
FROM members
WHERE category = (SELECT category FROM members WHERE member_name = "Gourav");

#ques :-2;
SELECT member_name,T.title_name,BI.issue_date,due_date
FROM book_issue AS BI LEFT JOIN members AS M ON M.member_id = BI.member_id
JOIN books AS B ON BI.accession_no= B.accession_no
JOIN titles AS T ON B.title_id= T.title_id
WHERE (BI.accession_no,BI.member_id) NOT IN (SELECT accession_no,member_id FROM book_return );


#Ques : - 3;
SELECT member_name,T.title_name,BI.issue_date,due_date
FROM book_issue AS BI LEFT JOIN members AS M ON M.member_id = BI.member_id
JOIN books AS B ON BI.accession_no= B.accession_no
JOIN titles AS T ON B.title_id= T.title_id
WHERE (BI.accession_no,BI.member_id) IN (SELECT accession_no,member_id FROM book_return WHERE TIMESTAMPDIFF(DAY,issue_date,return_date)>15 );


#Ques : - 4;
SELECT title_name , price, B.accession_no
FROM books AS B JOIN titles AS T ON B.title_id= T.title_id
WHERE price = (SELECT MAX(price) FROM books);

#Ques :-5;


SELECT MAX( price )
FROM books
WHERE price < ( SELECT MAX( price ) FROM books );


