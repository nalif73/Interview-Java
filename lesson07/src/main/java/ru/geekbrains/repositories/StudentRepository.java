package ru.geekbrains.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
