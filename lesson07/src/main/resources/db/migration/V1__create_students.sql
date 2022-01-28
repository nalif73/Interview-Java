CREATE TABLE students (
                          id        bigserial PRIMARY KEY,
                          name      VARCHAR(255),
                          age       INT
);

INSERT INTO students (name, age) VALUES
                                     ('Иванов', 24),
                                     ('Петров', 22),
                                     ('Сидоров', 19),
                                     ('Кузнецов', 30),
                                     ('Самылов', 40),
                                     ('Романов', 21),
                                     ('Истомин', 19),
                                     ('Игнатов', 25),
                                     ('Бородюк', 27),
                                     ('Токарев', 18);