package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by christophe on 23/01/17.
 */

public class Student {
    private String  firstName;
    private String  lastName;
    private LocalDate birthday;
    private int     age;

    // Le constructeur avec toutes les valeurs passées en paramètres
    public Student(String firstName, String lastName, LocalDate birthday, int age){
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.birthday   = birthday;
        this.age        = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge() {
        return age;
    }

    // Le Setter uniquement pour l'age qui est la seule donnée modifiable après l'instanciation
    public void age(int age) {
        age = age;
    }

    @Override
    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return   "\n----------------------------------------------------------"
                +"\nS T U D E N T :"
                +"\n----------------------------------------------------------"
                +"\nfirstName : " + this.firstName
                +"\nlastName  : " + this.lastName
                +"\nbirthday  : " + formatter.format(this.birthday)
                +"\nage       : " + this.age
                +"\n"
                ;
    }

    @Override
    public boolean equals(Object obj) {
        Student studentToCompare = (Student) obj;
        return (this.firstName== studentToCompare.getFirstName())
            && (this.lastName == studentToCompare.getLastName())
            && (this.birthday == studentToCompare.getBirthday())
            && (this.age      == studentToCompare.getAge()) ;
    }
}
