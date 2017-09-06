#Assignment 2;
#ques-1 -Display subject wise information on number of books purchased;
SELECT Subject.subject_name,Subject.subject_id,COUNT(accession_no) AS Number_of_books_purchased
FROM subjects AS Subject JOIN titles AS TITLES ON Subject.subject_id=TITLES.subject_id 
JOIN books AS BOOKS ON BOOKS.title_id = TITLES.title_id
GROUP BY subject_id;

#ques-2 -Display those rows where books issude for mare than 2 months;
SELECT accession_no,member_id,issue_date,due_date,TIMESTAMPDIFF(MONTH,issue_date,due_date) AS Return_duration_INMonths 
FROM book_issue
WHERE TIMESTAMPDIFF(MONTH,issue_date,due_date)>=2;


#Ques-3 - Display list of books having price greater than minimum price of the books purchased;
SELECT DISTINCT title_name
FROM titles AS TITLE JOIN books AS BOOKS ON TITLE.title_id=BOOKS.title_id
WHERE price > (SELECT MIN(price) FROM books);
