-- Last updated: 11/08/2026, 16:14:31
SELECT 
    class
FROM 
    Courses
GROUP BY 
    class
HAVING 
    COUNT(student) >= 5;