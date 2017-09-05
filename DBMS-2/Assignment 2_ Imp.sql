
#a SQL query:to display all the categories along with its Parent category.
SELECT C.category,M.category
FROM categories C LEFT JOIN categories M ON C.parent_id=M.category_id;

#SQL query:Result should be sorted on Parent Category.
SELECT C.category,M.category
FROM categories C LEFT JOIN categories M ON C.parent_id=M.category_id
ORDER BY M.category;

#SQL query:If category is top category then it should display “Top Category” in Parent category. 
SELECT C.category,IFNULL(M.category,"Top Category") as Parent_Category
FROM categories C LEFT JOIN categories M ON C.parent_id=M.category_id
ORDER BY M.category;

#Rewrite above SQL query to display only Top Categories.
SELECT C.category,IFNULL(M.category,"Top Category") as Parent_Category
FROM categories C LEFT JOIN categories M ON C.parent_id=M.category_id
WHERE M.category IS NULL;



