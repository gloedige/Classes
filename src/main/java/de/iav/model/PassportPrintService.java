package de.iav.model;

public class PassportPrintService<T> { //T macht die Klasse generisch / 
    private T print;

    public PassportPrintService(T print){ //Konstrukt gebaut
        this.print = print;
    }
    public String printPassport(T print){ //methode für printPasswort
        return ("*****" + print.toString() + "****++");
    }

    @Override
    public String toString() {
        return "PassportPrintService{" +
                "print=" + print +
                '}';
    }
}
