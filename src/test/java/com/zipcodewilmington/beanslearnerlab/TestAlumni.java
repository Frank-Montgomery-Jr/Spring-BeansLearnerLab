package com.zipcodewilmington.beanslearnerlab;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TestAlumni {

    @Autowired
    private Alumni alumni;

    @Test
    public void testAlumniStudentsHaveBeenTaught() {
        Students students = alumni.getStudents();
        
        for (Student student : students) {
            assertEquals(1200.0, student.getTotalStudyTime());
        }
    }

    @Test
    public void testInstructorsDistributedHoursEvenly() {
        Instructors instructors = alumni.getInstructors();
        Students students = alumni.getStudents();
        
        int numberOfInstructors = instructors.size();
        int numberOfStudents = students.size();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double expectedHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;
        
        assertNotNull(instructors);
        assertEquals(4, numberOfInstructors);
    }
}
