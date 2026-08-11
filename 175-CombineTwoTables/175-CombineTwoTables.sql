-- Last updated: 11/08/2026, 16:18:37
SELECT p.FirstName, p.LastName, a.City, a.State
FROM Person p
LEFT JOIN Address a
ON p.PersonId = a.PersonId;
# Write your MySQL query statement below
