
#Assignment 3
#Ques-1- Display total number of of student ,number of faculty and others in a single row;
SELECT COUNT(IF(category="S",1,null)) AS Student_count , 
COUNT(IF(category="F",1,null)) AS Faculty_count , 
COUNT(IF(category!="F" and category!="S",1,null)) AS OTHERS
FROM members;

#Ques-2 - Display those title which has been issue for more than 2 times;
SELECT T.title_name
FROM book_issue AS BI LEFT JOIN books AS B ON BI.accession_no = B.accession_no
JOIN titles AS T ON B.title_id=T.title_id
GROUP BY T.title_name
HAVING COUNT(T.title_name)>=2;


#Ques 3:- Display books that has been issued other than Faculty;
SELECT T.title_name,B.accession_no
FROM book_issue AS BI LEFT JOIN members AS M ON BI.member_id=M.member_id
JOIN books AS B ON BI.accession_no = B.accession_no
JOIN titles AS T ON B.title_id = T.title_id
WHERE M.member_id IN (SELECT member_id FROM members WHERE category != "F");


#Ques 4:- Display authors for which  atleast one book has been purchased;
SELECT A.author_id,A.author_name
FROM authors AS A JOIN title_author AS TA ON A.author_id=TA.author_id
JOIN books AS B ON B.title_id= TA.title_id
GROUP BY author_id
HAVING COUNT(A.author_id)>=1;