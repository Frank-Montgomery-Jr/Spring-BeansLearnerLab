package com.zipcodewilmington.beanslearnerlab;



import com.zipcodewilmington.beanslearnerlab.config.ClassroomConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TestClassroomConfig {

    @Autowired
    @Qualifier("currentCohort")
    private Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;

    @Test
    public void testCurrentCohort() {
        assertNotNull(currentCohort);
        assertNotNull(currentCohort.getInstructors());
        assertNotNull(currentCohort.getStudents());
        assertEquals(4, currentCohort.getInstructors().size());
        assertEquals(3, currentCohort.getStudents().size());
    }

    @Test
    public void testPreviousCohort() {
        assertNotNull(previousCohort);
        assertNotNull(previousCohort.getInstructors());
        assertNotNull(previousCohort.getStudents());
        assertEquals(4, previousCohort.getInstructors().size());
        assertEquals(3, previousCohort.getStudents().size());
    }
}
