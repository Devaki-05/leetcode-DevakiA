-- Last updated: 11/08/2026, 16:14:39
# Write your MySQL query statement below
# Write your MySQL query statement below
SELECT customer_number
FROM Orders
GROUP BY customer_number
ORDER BY COUNT(order_number) DESC
LIMIT 1;