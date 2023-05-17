package de.iav.model;

import java.util.*;

public class StudentDB {
    private HashMap<Integer, Student> students;

    public StudentDB(HashMap<Integer, Student> students) {
        this.students = students;
    }

    public HashMap<Integer, Student> getStudents() {
        return students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentDB studentDB = (StudentDB) o;

        return Objects.equals(students, studentDB.students);
    }

    @Override
    public int hashCode() {
        return students != null ? students.hashCode() : 0;
    }

    public void setStudents(HashMap<Integer, Student> students) {
        this.students = students;
    }

    public Student findById(int idToFind) {
        return this.students.get(idToFind);
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }
}
