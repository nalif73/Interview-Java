package ru.geekbrains.builder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .address("ул. Ленина, д.2, кв.5")
                .age(35)
                .country("Россия")
                .gender("Мужской")
                .firstName("Иван")
                .middleName("Иванович")
                .lastName("Иванов")
                .phone("823456782134")
                .build();
        System.out.println(person);


    }
}
