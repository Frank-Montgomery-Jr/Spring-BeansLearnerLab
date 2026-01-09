package com.zipcodewilmington.beanslearnerlab;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Alumni {

    @Autowired
    @Qualifier("previousStudents")
    private Students students;

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;

    @PostConstruct
    public void executeBootcamp() {
        double totalNumberOfHours = 1200;
        
        for (Student student : students) {
            instructors.findAll().get(0).teach(student, totalNumberOfHours);
        }
    }

    public Students getStudents() {
        return students;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
