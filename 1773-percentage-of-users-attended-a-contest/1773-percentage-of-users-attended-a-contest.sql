# Write your MySQL query statement below
select contest_id, round(count(r.user_id) * 100/ (select count(*) from users) , 2) as percentage
from register r
group by contest_id
order by percentage desc, contest_id