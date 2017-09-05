
/* a SQL query for that returns a Resultset containing Zip Code, 
City Names and States ordered by State Name and City Name.
*/
SELECT zip_code AS ZIP_Code ,city_name AS City ,state_name AS State
FROM city AS C LEFT JOIN state AS S ON C.state_code= S.state_code
ORDER BY state_name , city_name;