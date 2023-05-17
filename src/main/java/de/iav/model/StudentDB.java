package de.iav.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDB {
    private ArrayList<Student> students;

    public StudentDB(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
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
        return "StudentDB{" +
                "students=" + students.toString() +
                '}';
    }
}
