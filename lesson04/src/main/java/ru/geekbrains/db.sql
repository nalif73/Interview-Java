CREATE TABLE `film` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(255) NOT NULL,
    `duration` time,
    PRIMARY KEY (`id`)
    );

CREATE TABLE `seans` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `film_id` int(11) NOT NULL,
    `start` datetime,
    `price` int(11),
    PRIMARY KEY (`id`),
    FOREIGN KEY (`film_id`) REFERENCES `film` (`id`)
    );

CREATE TABLE `ticket` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `seans_id` int(11) NOT NULL,
    PRIMARY KEY (`id`),
    FOREIGN KEY (`seans_id`) REFERENCES `seans`(`id`)
    );

INSERT INTO `film` VALUES
                     (1,'Вальдо','01:00:00'),
                     (2,'Последний богатырь','01:30:00'),
                     (3,'Матрица','02:00:00'),
                     (4,'Дюна','01:30:00');
INSERT INTO `seans` VALUES (1,1,'2022-01-20 09:00:00',100),(2,1,'2022-01-20 09:00:00',200),(3,1,'2022-01-20 10:00:00',300),
                           (4,2,'2022-01-21 12:00:00',100),(5,2,'2022-01-21 18:00:00',100),(6,2,'2022-08-22 19:00:00',100),
                           (7,3,'2022-01-22 21:30:00',150), (8,4,'2022-01-23 09:30:00',150), (8,4,'2022-01-23 12:00:00',300),
                           (8,4,'2022-01-23 13:00:00',350);
INSERT INTO `ticket` VALUES (1,1),(2,1),(3,1),(4,1),(5,2),(6,2),(7,2),(8,2),(9,2),(10,2),
                            (11,2),(12,2),(13,3),(14,3),(15,3),(16,4),(17,4),(18,5),(19,5),(20,6);