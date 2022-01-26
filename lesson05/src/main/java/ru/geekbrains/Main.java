package ru.geekbrains;

import ru.geekbrains.dao.Students;
import ru.geekbrains.entity.Student;

public class Main {

    private final static java.util.Random rand = new java.util.Random();

    public static void main(String[] args) {
        Students studentDAO = new Students();
        for (int i = 1; i <= 1000; i++) {
            Student student = new Student("Студент-" + i, i);
            studentDAO.addNewStudent(student);
        }
        studentDAO.deleteStudent(100L);

        studentDAO.updateStudent(10L, "Ivan", 100);

        System.out.println(studentDAO.getStudentById(10L));

    }

}
