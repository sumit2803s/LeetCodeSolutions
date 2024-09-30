CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  set N = N - 1;
  RETURN (
      # Write your MySQL query statement below.
SELECT DISTINCT Salary FROM employee
ORDER BY salary DESC LIMIT 1 OFFSET N
 );
END