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

    ArrayList<Student> etudiants = new ArrayList<>();

    // Le constructeur avec uniqument le nom de la classe
    public School( String name) {
        this.name = name;
    }

    // La méthode pour ajouter les étudiants
    // sans avoir besoin d'utiliser un objet Student en entrée.
    // On doit pouvoir utiliser l'objet School sans les héritages
    public void addStudent( String firstName, String lastName, String birthday, int age){
        this.etudiants.add( new Graduate(firstName, lastName, birthday, age) );

        // A remplacer par ça, si on voulait garder le comportement spécifique de l'objet Student,
        // dans notre cas on n'aurai pas d'affichage du diplome.
        // this.etudiants.add( new Student(firstName, lastName, birthday, age) );
        addCommonProcess(age);
    }
    // On doit pouvoir utiliser l'objet School sans connaitre l'objet Graduate aussi
    public void addStudent( String firstName, String lastName, String birthday, int age, int grade){
        this.etudiants.add( new Graduate(firstName, lastName, birthday, age, grade) );
        addCommonProcess(age);
    }

    // Traitemetns communs lors de l'ajout d'un etudiant
    private void addCommonProcess(int age){
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
