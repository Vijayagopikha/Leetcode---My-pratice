select round(count(distinct a.player_id) / count(distinct f.player_id) ,2) as fraction
from 
( select player_id, min(event_date) as player_date
   from activity
   group by player_id) f
left join activity a
on a.player_id = f.player_id
and datediff(a.event_date, f.player_date) = 1;
