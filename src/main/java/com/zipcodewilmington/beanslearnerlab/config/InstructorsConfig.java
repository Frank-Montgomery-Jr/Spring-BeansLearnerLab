package com.zipcodewilmington.beanslearnerlab.config;



import com.zipcodewilmington.beanslearnerlab.Instructor;
import com.zipcodewilmington.beanslearnerlab.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {

    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors() {
        return new Instructors(
            new Instructor(1L, "John Smith"),
            new Instructor(2L, "Jane Doe")
        );
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors() {
        return new Instructors(
            new Instructor(3L, "James Bond"),
            new Instructor(4L, "Emily Watson")
        );
    }

    @Bean(name = "instructors")
    @Primary
    public Instructors instructors() {
        Instructors allInstructors = new Instructors();
        allInstructors.addAll(tcUsaInstructors());
        allInstructors.addAll(tcUkInstructors());
        return allInstructors;
    }
}
