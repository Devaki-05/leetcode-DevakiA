-- Last updated: 11/08/2026, 16:18:17
# Write your MySQL query statement below
SELECT name AS Customers
FROM Customers c
LEFT JOIN Orders o ON c.id = o.customerId
WHERE o.customerId IS NULL;