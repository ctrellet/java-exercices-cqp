package com.company;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * Created by christophe on 23/01/17.
 */
public class School {

    private String name;
    ArrayList<Student> etudiants = new ArrayList<Student>();

    // Le constructeur avec uniqument le nom de la classe
    public School( String name) {
        this.name = name;
    }

    // La méthode pour ajouter les étudiants
    public void addStudent( Student unEtudiant){
        this.etudiants.add(unEtudiant);
    }
    // La même mais sans avoir besoin d'utiliser un objet Student en entrée.
    // On doit pouvoir utiliser l'obejt School sans connaitre l'objet Student
    public void addStudent( String firstName, String lastName, String birthday, int age){
        this.etudiants.add( new Student(firstName, lastName, birthday, age) );
    }

    // La Méthode toString
    public String toString() {
        return "\n=========================================================="
                + "\nS C H O O L : " + this.name + etudiants.toString();
    }


}
