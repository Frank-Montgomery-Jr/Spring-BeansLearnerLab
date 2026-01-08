package com.zipcodewilmington.beanslearnerlab.config;

import com.zipcodewilmington.beanslearnerlab.Student;
import com.zipcodewilmington.beanslearnerlab.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean(name = "students")
    public Students currentStudents() {
        return new Students(
            new Student(1L, "Alice"),
            new Student(2L, "Bob"),
            new Student(3L, "Charlie")
        );
    }

    @Bean(name = "previousStudents")
    public Students previousStudents() {
        return new Students(
            new Student(4L, "David"),
            new Student(5L, "Eve"),
            new Student(6L, "Frank")
        );
    }
}
