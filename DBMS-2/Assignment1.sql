
#Command to display all coloumn of the member table
SELECT member_id, member_name, addressline1, addressline2, category
FROM members;

#Command to display selected coloumn of member table
SELECT member_name, member_id, category
FROM members;

#Command to display details of members of category F
SELECT member_name, member_id, category
FROM members
WHERE category = 'F';

#Command to display categories of members
SELECT category
FROM members
GROUP BY category;

#Command to display details in decending order of members name
SELECT member_name,category
FROM members
ORDER BY member_name DESC;

#Command to display the number of members in the category
SELECT category, COUNT(member_id) AS Number_of_members
FROM members
GROUP BY category;

#Display name of members which belong to keshav sharma category
SELECT M.member_name
FROM members as M JOIN members as M2
WHERE M2.member_name="Keshav Sharma" AND M.category=M2.category;
