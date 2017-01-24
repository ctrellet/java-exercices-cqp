package com.company;

/**
 * Created by christophe on 23/01/17.
 */
public class Graduate extends Student {

    private int grade;

    public Graduate(String firstName, String lastName, String birthday, int age, int grade){
        super( firstName, lastName, birthday, age);
        this.grade=grade;
    }

    public Graduate(String firstName, String lastName, String birthday, int age) {
        super(firstName, lastName, birthday, age);
        this.grade=0;
    }

    @Override
    public String toString() {
        String toReturn = super.toString() + "Diplome   : " ;
        switch (this.grade){
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

        return toReturn+"\n";
    }
}
