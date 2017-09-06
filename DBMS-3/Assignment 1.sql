
#Assignment-1:
#ques 1 - books issused for more than two months;
SELECT M.member_name,M.member_id,T.title_name,B.accession_no,BI.issue_date,BI.due_date ,TIMESTAMPDIFF(MONTH,BI.issue_date,IFNULL(BR.return_date,NOW())) AS MONTHS
FROM members AS M JOIN book_issue AS BI ON M.member_id=BI.member_id
JOIN books AS B ON B.accession_no= BI.accession_no
JOIN titles AS T ON T.title_id = B.title_id
LEFT JOIN book_return AS BR ON BI.accession_no=BR.accession_no AND BI.member_id = BR.member_id AND
BI.issue_date=BR.issue_date
WHERE TIMESTAMPDIFF(MONTH,BI.issue_date,IFNULL(BR.return_date,NOW()))>=2
ORDER BY member_name,title_name;

#ques-2 - Display those rows having max length of the member name;
SELECT member_name , LENGTH(member_name) AS LENGTH
FROM members
WHERE LENGTH(member_name)=(SELECT MAX(LENGTH(member_name)) FROM members);

#ques-3 - Display count of number of books issused so far;
SELECT COUNT(issue_date) AS Number_of_books_issue 
FROM book_issue;

