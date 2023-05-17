package de.iav.model;

public abstract class Student {
        private int id;
        private int age;
        private String name;
        private String courseOfStudies;

        //Konstruktor
        public Student (int id, int age, String name, String courseOfStudies){
        this.id =id;
        this.age = age;
        this.name = name;
        this.courseOfStudies = courseOfStudies;

    }
    public Student (){

    }
    public abstract void printExample();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseOfStudies() {
        return courseOfStudies;
    }

    public void setCourseOfStudies(String courseOfStudies) {
        this.courseOfStudies = courseOfStudies;
    }

    public String toString(){
        return "Age of student: " + age +"; Name of student: " + name + "; Course of student: " + courseOfStudies;
    }
}
