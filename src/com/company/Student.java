package com.company;

/**
 * Created by christophe on 23/01/17.
 */

import java.time.LocalDate;  // permet de gérer des dates uniquement (pas les heures) et sans gestion de fuseau horaire

public class Student {
    private String  firstName;
    private String  lastName;
    private String  birthday;
    private int     age;

    // Le constructeur avec toutes les valeurs passées en paramètres
    public Student(String firstName, String lastName, String birthday, int age){
        this.firstName  = firstName;
        this.lastName   = lastName;
        this.birthday   = birthday;
        this.age        = age;
    }

    // Les Getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getAge() {
        return age;
    }

    // Le Setter uniquement pour l'age qui est la seule donnée modifiable après l'instanciation
    public void age(int age) {
        age = age;
    }

    // Methode toString


    @Override
    public String toString() {
        return   "\n----------------------------------------------------------"
                +"\nS T U D E N T :"
                +"\n----------------------------------------------------------"
                +"\nfirstName : " + this.firstName
                +"\nlastName  : " + this.lastName
                +"\nbirthday  : " + this.birthday
                +"\nage       : " + this.age
                +"\n"
                ;
    }
}
