-- Last updated: 11/08/2026, 16:18:24
SELECT Email
FROM Person
GROUP BY Email
HAVING COUNT(*) > 1;
# Write your MySQL query statement below
