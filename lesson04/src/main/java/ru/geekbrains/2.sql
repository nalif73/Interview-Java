-- перерывы больше или равные 30 минут между фильмами, выводятся по уменьшению длительности перерыва.
-- Выводить надо колонки «фильм 1», «время начала», «длительность», «время начала второго фильма», «длительность перерыва».

select
    s1.id,
    s1.film_id,
    s1.start,
    f1.duration,
    timediff( min(s2.start), date_add(s1.start, interval f1.duration HOUR_SECOND) ) as break
from seans s1
         join film f1 on s1.film_id = f1.id
         left join seans s2 on s1.start < s2.start
group by s1.start
HAVING time_to_sec(break) > 60 * 30
ORDER BY break DESC;