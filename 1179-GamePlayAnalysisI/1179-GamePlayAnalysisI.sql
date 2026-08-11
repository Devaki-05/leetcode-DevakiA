-- Last updated: 11/08/2026, 16:12:10
# Write your MySQL query statement below
SELECT 
    player_id, 
    MIN(event_date) AS first_login
FROM 
    Activity
GROUP BY 
    player_id;