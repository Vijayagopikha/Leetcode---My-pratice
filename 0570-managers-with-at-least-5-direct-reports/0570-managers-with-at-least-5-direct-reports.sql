# Write your MySQL query statement below


/*select name
from employee e1 join (select managerId,count(managerId) 
                    from employee
                    group by managerId
                    having count(*) >= 5) e2
on e1.id = e2.managerId */


select e1.name
from employee e1, employee e2
where e1.id = e2.managerId
group by e2.managerId
having count(e2.managerId) >= 5