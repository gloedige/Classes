package de.iav.model;

import java.sql.SQLOutput;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException() {
        super("the requested student could not be found.");
    }
}
