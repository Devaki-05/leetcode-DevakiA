-- Last updated: 11/08/2026, 16:18:34
# Write your MySQL query statement below
# Write your MySQL query statement below
SELECT (
    SELECT DISTINCT salary 
    FROM Employee 
    ORDER BY salary DESC 
    LIMIT 1 OFFSET 1
) AS SecondHighestSalary;