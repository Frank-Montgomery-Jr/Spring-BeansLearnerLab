package com.zipcodewilmington.beanslearnerlab;



import com.zipcodewilmington.beanslearnerlab.Students;
import com.zipcodewilmington.beanslearnerlab.config.StudentConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TestStudentConfig {

    @Autowired
    @Qualifier("students")
    private Students currentStudents;

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Test
    public void testCurrentStudents() {
        assertNotNull(currentStudents);
        assertEquals(3, currentStudents.size());
    }

    @Test
    public void testPreviousStudents() {
        assertNotNull(previousStudents);
        assertEquals(3, previousStudents.size());
    }
}
