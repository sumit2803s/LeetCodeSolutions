# Write your MySQL query statement below
SELECT w2.id from weather w1 JOIN weather w2 ON DATEDIFF(w2.recordDate,w1.recordDate)=1
WHERE w2.temperature > w1.temperature;