#Command to display title name ,subject_name,publishers
SELECT title_name, subject_name, publisher_name
FROM titles LEFT JOIN Subjects ON titles.subject_id = subjects.subject_id 
LEFT JOIN publishers ON titles.publisher_id = publishers.publisher_id;

#Command to display all the deatils of all the books issused
SELECT bi.issue_date AS Issue_Date ,bi.accession_no AS Accession_No, bi.member_id AS Member_ID, IFNULL(br.return_date," ") AS Return_Date
FROM book_issue AS bi LEFT JOIN book_return AS br ON bi.accession_no = br.accession_no AND bi.member_id = br.member_id;


#Assignment 2; to display above query in assecding oder of issue_date and then by member name ;
SELECT bi.issue_date AS Issue_Date ,bi.accession_no AS Accession_No, bi.member_id AS Member_ID, IFNULL(br.return_date," ") AS Return_Date
FROM book_issue AS bi LEFT JOIN book_return AS br ON bi.accession_no = br.accession_no AND bi.member_id = br.member_id 
LEFT JOIN members AS M ON m.member_id = bi.member_id
ORDER BY bi.issue_date,member_name;

