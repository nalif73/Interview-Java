-- ошибки в расписании (фильмы накладываются друг на друга), отсортированные по возрастанию времени.
-- Выводить надо колонки «фильм 1», «время начала», «длительность», «фильм 2», «время начала», «длительность»;

select
    f.name,
    s.start,
    f.duration,
    f2.name,
    s2.start,
    s2.price
from seans s
         join film f on s.film_id = f.id
         join seans s2 on s2.start > s.start and s2.start < date_add(s.start, interval f.duration HOUR_SECOND)
         join film f2 on s2.film_id = f2.id
order by s.start asc;