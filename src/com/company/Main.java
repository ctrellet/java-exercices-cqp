package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    	// On instancie des étudiants
        School maClasse = new School("InfoJava");
        maClasse.addStudent( "Stéphanie" ,"Durand" ,"12/11/1980",37);
        maClasse.addStudent( "Mamadou"   ,"Fort"   ,"13/09/1992",25);
        maClasse.addStudent( "Florence"  ,"Lune"   ,"05/04/2001",16);
        maClasse.addStudent( "Loic"      ,"Martin" ,"07/07/1998",19);

        maClasse.addStudent( "Drake"     ,"Foudre" ,"11/11/1990",27, 2);
        maClasse.addStudent( "Solange"   ,"Feu"    ,"12/12/1990",27, 5);
        maClasse.addStudent( "Johnny"    ,"Lumière","01/10/1990",27, 3);

        System.out.println(maClasse);
    }
}


