-- Last updated: 11/08/2026, 16:18:29
SELECT e1.name AS Employee
FROM Employee e1
JOIN Employee e2 ON e1.managerId = e2.id
WHERE e1.salary > e2.salary;# Write your MySQL query statement below
