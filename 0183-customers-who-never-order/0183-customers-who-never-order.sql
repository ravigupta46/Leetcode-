# Write your MySQL query statement below
Select c.name as customers
from customers c
left join orders o
on c.id=o.customerId
where o.customerId IS NULL;
