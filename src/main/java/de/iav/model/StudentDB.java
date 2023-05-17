package de.iav.model;

import java.util.Arrays;

public class StudentDB {
    private Student [] students;
    public StudentDB(Student [] students) {
        this.students = students.clone();
    }

    public Student findById(int idToFind) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getId() == idToFind) {
                return student;
            }
        }
        throw new StudentNotFoundException();//("ID:" + idToFind); // hier ist die message
    }
    @Override
    public String toString() {
        return "Output der StudendDB - students=" + Arrays.toString(students);
    }
}
