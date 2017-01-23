package com.company;

/**
 * Created by christophe on 23/01/17.
 */
public class Student {
    private String firstName;
    private String lastName;
    private String birthday;
    private int age;

    public Student(String firstName, String lastName, String birthday, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday=birthday;
        this.age=age;
    }

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

    public void age(int age) {
        age = age;
    }
    public


}
