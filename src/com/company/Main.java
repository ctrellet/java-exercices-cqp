package com.company;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Main {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // On instancie des étudiants
        School maClasse = new School("InfoJava");
        maClasse.addStudent( "Stéphanie" ,"Durand" , LocalDate.parse("12/11/1980",formatter),37);
        maClasse.addStudent( "Mamadou"   ,"Fort"   , LocalDate.parse("13/09/1992",formatter),25);
        maClasse.addStudent( "Florence"  ,"Lune"   , LocalDate.parse("05/04/2001",formatter),16);
        maClasse.addStudent( "Loic"      ,"Martin" , LocalDate.parse("07/07/1998",formatter),19);

        maClasse.addStudent( "Drake"     ,"Foudre" , LocalDate.parse("11/11/1990",formatter),27, 2);
        maClasse.addStudent( "Solange"   ,"Feu"    , LocalDate.parse("12/12/1990",formatter),27, 5);
        maClasse.addStudent( "Johnny"    ,"Lumière", LocalDate.parse("01/10/1990",formatter),27, 3);

        System.out.println(maClasse);

        Student solange = maClasse.getGraduate(5);
        Student johnny  = maClasse.getGraduate(6);

        // System.out.println(solange);
        // System.out.println(johnny);

        System.out.println( "\n==========================================================");
        System.out.println( "Comparaison de Solange et Johnny : " + solange.equals(johnny) );
        System.out.println( "==========================================================");

    }
}


