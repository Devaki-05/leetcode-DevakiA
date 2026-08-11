-- Last updated: 11/08/2026, 16:13:55
# Write your MySQL query statement below
UPDATE Salary
SET sex = CASE 
    WHEN sex = 'm' THEN 'f'
    ELSE 'm'
END;