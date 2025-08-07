# Write your MySQL query statement below
select p.product_name, sum(o.unit) as unit
from Products p
join Orders o
using(product_id)
where YEAR(o.order_date) = '2020' AND MONTH(o.order_date) = '02'
GROUP BY p.product_id
HAVING SUM(unit) >= 100
