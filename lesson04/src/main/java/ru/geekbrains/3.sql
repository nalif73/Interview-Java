-- список фильмов, для каждого указано общее число посетителей за все время, среднее число зрителей за сеанс и общая сумма сбора по каждому,
-- отсортированные по убыванию прибыли.
-- Внизу таблицы должна быть строчка «итого», содержащая данные по всем фильмам сразу.
(select
     s.film_id,
     count(*) as total_all_time,
     count(*) / count(distinct b.seans_id) as avg_buyed,
     sum(s.price) as total_price
 from seans s
          join ticket b on s.id = b.seans_id
 GROUP BY s.film_id
 ORDER BY total_price desc
)
union
select "Итого", count(*), count(b.seans_id) / count(distinct b.seans_id), sum(s.price)
from seans s
         join ticket b on s.id = b.seans_id;