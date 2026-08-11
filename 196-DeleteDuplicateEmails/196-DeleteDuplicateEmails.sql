-- Last updated: 11/08/2026, 16:18:08
# Write your MySQL query statement below
DELETE p1
FROM Person p1
JOIN Person p2
ON p1.Email = p2.Email
AND p1.Id > p2.Id;
