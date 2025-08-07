# Write your MySQL query statement below
select * from users
where mail REGEXP '^[A-Za-z][A-Za-z0-9_.-]*@leetcode\\.com$'
AND RIGHT(mail,13) = BINARY '@leetcode.com';