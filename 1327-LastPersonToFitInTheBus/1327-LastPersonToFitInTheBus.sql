-- Last updated: 11/08/2026, 16:11:59
# Write your MySQL query statement below
# Write your MySQL query statement below
WITH RunningWeights AS (
    SELECT 
        person_name,
        SUM(weight) OVER(ORDER BY turn ASC) AS total_weight
    FROM 
        Queue
)
SELECT 
    person_name
FROM 
    RunningWeights
WHERE 
    total_weight <= 1000
ORDER BY 
    total_weight DESC
LIMIT 1;