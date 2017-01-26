package com.company;

import java.time.LocalDate;

/**
 * Created by christophe on 23/01/17.
 */

public class Graduate extends Student {

    private int grade;

    public Graduate(String firstName, String lastName, LocalDate birthday, int age, int grade){
        super( firstName, lastName, birthday, age);
        this.grade=grade;
    }

    public Graduate(String firstName, String lastName, LocalDate birthday, int age) {
        super(firstName, lastName, birthday, age);
        this.grade=0;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        String toReturn = super.toString() + "Diplome      : " ;
        return gradeInt2str(this.grade)+"\n";
    }

    // Conversion de d'indice du grade en libellé
    public String gradeInt2str( int grade){
        String toReturn = super.toString() + "Diplome   : " ;
        switch (grade){
            case 1:  toReturn += "bac";
                break;
            case 2:  toReturn += "bac+2";
                break;
            case 3:  toReturn += "bac+3";
                break;
            case 4:  toReturn += "bac+4";
                break;
            case 5:  toReturn += "bac+5";
                break;
            default: toReturn += "inconnu";
                break;
        }
        return toReturn;
    }

    @Override
    public boolean equals(Object obj) {
        // On ne compare que l'attribut de la class, le reste est fait dans la class parent ,
        Graduate graduateToCompare = (Graduate) obj;
        return super.equals(graduateToCompare) && (this.grade==graduateToCompare.getGrade());
    }
}
