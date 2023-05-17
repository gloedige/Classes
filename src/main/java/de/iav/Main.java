package de.iav;

import de.iav.model.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

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

        ArrayList<Student> studentsArray = new ArrayList<>();
        studentsArray.add(zied); //new Student(34566, 34, "Zied", "JavaCourse");
        studentsArray.add(houman);//new Student(34568, 34, "Houman", "Java");
        studentsArray.add(sergej);//new Student(34567, 40, "Gerd", "JavaBootcamp");

        System.out.println(studentsArray.toString());

        StudentDB studentDB = new StudentDB(studentsArray);
        try{
            System.out.println(studentDB.findById(2));
        }

            catch(StudentNotFoundException e){
                System.out.println(e.getMessage());
        }


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