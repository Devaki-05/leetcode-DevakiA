-- Last updated: 11/08/2026, 16:18:30
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  SET N = N - 1;
  RETURN (
      # Write your MySQL query statement below.
      SELECT DISTINCT salary 
      FROM Employee
      ORDER BY salary DESC
      LIMIT 1 OFFSET N
  );
END