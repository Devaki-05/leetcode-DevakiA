-- Last updated: 11/08/2026, 16:14:54
# Write your MySQL query statement below
# Write your MySQL query statement below
SELECT 
    e.name, 
    b.bonus
FROM 
    Employee AS e
LEFT JOIN 
    Bonus AS b 
ON 
    e.empId = b.empId
WHERE 
    b.bonus < 1000 
    OR b.bonus IS NULL;