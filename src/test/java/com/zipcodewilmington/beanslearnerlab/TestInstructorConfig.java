package com.zipcodewilmington.beanslearnerlab;

import com.zipcodewilmington.beanslearnerlab.config.InstructorsConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TestInstructorConfig {

    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    private Instructors tcUkInstructors;

    @Autowired
    @Qualifier("instructors")
    private Instructors allInstructors;

    @Test
    public void testTcUsaInstructors() {
        assertNotNull(tcUsaInstructors);
        assertEquals(2, tcUsaInstructors.size());
    }

    @Test
    public void testTcUkInstructors() {
        assertNotNull(tcUkInstructors);
        assertEquals(2, tcUkInstructors.size());
    }

    @Test
    public void testAllInstructors() {
        assertNotNull(allInstructors);
        assertEquals(4, allInstructors.size());
    }
}
