package de.iav.model;

public class ComputerScienceStudents extends Student implements Citizen{
    private String gender;

    public ComputerScienceStudents(){

    }

    public ComputerScienceStudents(int id, int age, String name, String courseOfStudies, String gender){
        super(id, age, name, courseOfStudies);
        this.gender = gender;
    }

    @Override
    public String getAdress() {
        System.out.println("Please");
        return null;
    }

    @Override
    public int getIdentityCardNumber() {
        return 0;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void printExample() {
        System.out.println("This is an example!");
    }

    @Override
    public String toString() {
        return "ComputerScienceStudents{" +
                "gender='" + gender + '\'' +
                '}';
    }
}
