package com.company;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * Created by christophe on 23/01/17.
 */
public class School {

    private String name;
    private int nbStudents = 0;
    private int cumulAge = 0;

    ArrayList<Student> etudiants = new ArrayList<Student>();

    // Le constructeur avec uniqument le nom de la classe
    public School( String name) {
        this.name = name;
    }

    // La méthode pour ajouter les étudiants
    // sans avoir besoin d'utiliser un objet Student en entrée.
    // On doit pouvoir utiliser l'obejt School sans connaitre l'objet Student
    public void addStudent( String firstName, String lastName, String birthday, int age){
        this.etudiants.add( new Student(firstName, lastName, birthday, age) );
        this.nbStudents++;
        this.cumulAge+=age;
    }

    // Obtenir le moyenne d'age de la clasee (0 si aucun éléves)
    public double averageAge(){
        if (this.nbStudents==0) {
            return (double) 0 ;
        }
        else{
            return (double) this.cumulAge / (double) this.nbStudents;
        }
    }

    // La Méthode toString
    public String toString() {
        return "\n=========================================================="
                + "\nS C H O O L : " + this.name +" "+ etudiants.toString()+
               "\n----------------------------------------------------------"
                + "\nMoyenne d\'age : " + this.averageAge()+
               "\n==========================================================";

    }


}
