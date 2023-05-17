package de.iav;

import de.iav.model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        Student gerd = new ComputerScienceStudents(23455, 45, "Muslim", "physics", "male");
        //gerd.age = 40;
        gerd.setAge(40);
        gerd.setName("Gerd");
        gerd.setCourseOfStudies("java software developer");
        //System.out.println("Gerd: " + gerd);
        //System.out.println(gerd.getAge());

        //Car dirksVw = new Car("black", "VW", 2006, "Passat");
        ComputerScienceStudents houman = new ComputerScienceStudents(23456, 35, "Houman", "softwareDeveloper", "male");
        //System.out.println("Houman: " + houman);

        // hier wird das Objekt instantiiert
        Student zied = new ComputerScienceStudents(6543, 35, "Zied", "JavaCourse", "female");
        Student sergej = new ComputerScienceStudents(5544, 25, "sergej", "MasterCouch", "male");

        HashMap<Integer, Student> studentsArray = new HashMap<>();
        studentsArray.put(6543, zied);
        studentsArray.put(23456, houman);
        studentsArray.put(5544, sergej);

        System.out.println(studentsArray.toString());
        System.out.println("The stundent with number: " +zied.getId() + " is " + studentsArray.get(6543));

        StudentDB studentDB = new StudentDB(studentsArray);

        //System.out.println(studentDB);

        ComputerScienceStudents[] computerScienceStudentsArray = new ComputerScienceStudents[3];
        computerScienceStudentsArray[0] = new ComputerScienceStudents(345, 23455, "zied", "java", "male");

        ComputerScienceStudents Ausgabe = new ComputerScienceStudents();
        Ausgabe.printExample();

        PassportPrintService<Integer> passportPrintService = new PassportPrintService<>(3);
        passportPrintService.printPassport(3);

    }
    //public Student randomStudent(){
    //    return;
    //}
}