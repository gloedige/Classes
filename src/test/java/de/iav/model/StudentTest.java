package de.iav.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void testToCheckStudentsAreEqual (){
        Student gerd = new ComputerScienceStudents(1234, 40, "Gerd", "mechanicalEngineer", "male");
        Student gerd2 = new ComputerScienceStudents(2345, 40, "Gerd", "mechanicalEngineer", "male");

        assertEquals(gerd,gerd2);
    }
}