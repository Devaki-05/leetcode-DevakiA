-- Last updated: 11/08/2026, 16:14:37
# Write your MySQL query statement below
SELECT name, population, area
FROM World
WHERE area >= 3000000 OR population >= 25000000;