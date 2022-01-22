-- число посетителей и кассовые сборы, сгруппированные по времени начала фильма: с 9 до 15, с 15 до 18, с 18 до 21, с 21 до 00:00.
select hour(s.start), sum(price), count(*) from seans s
                                                    join ticket b on s.id = b.seans_id
group by
    (hour(start) > 9 and hour(start) <= 15),
    (hour(start) > 15 and hour(start) <= 18),
    (hour(start) > 18 and hour(start) <= 21),
    (hour(start) > 21 and hour(start) <= 00);