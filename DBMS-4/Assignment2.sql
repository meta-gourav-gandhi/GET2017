
#ques 1:-;
CREATE VIEW member_issue_details AS
SELECT member_name ,title_name,issue_date
FROM members AS M JOIN book_issue AS BI ON M.member_id=BI.member_id
JOIN books B ON BI.accession_no= B.accession_no
JOIN titles AS T ON B.title_id=T.title_id;


#ques 2:-;
CREATE VIEW members_details AS
SELECT member_name,member_id, CASE WHEN category = "F" THEN "Faculty"
WHEN category="S" THEN "Student"
ELSE "Other" END AS category
FROM members;

#ques 3:-;
CREATE VIEW details AS
SELECT member_name, category,title_name,subject_name,BI.issue_date,BI.due_date,BR.return_date
FROM book_issue BI LEFT JOIN book_return AS BR ON BI.member_id=BR.member_id AND BI.accession_no=BR.accession_no
AND BI.issue_date=BR.issue_date 
JOIN members AS M ON M.member_id=BI.member_id
JOIN books AS B ON B.accession_no = BI.accession_no
JOIN titles AS T ON T.title_id = B.title_id
JOIN subjects AS S ON S.subject_id = T.subject_id;