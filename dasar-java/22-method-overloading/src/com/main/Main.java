package com.main;

public class Main {
    public static void main(String[] args) {
        sayHaii("Elvin");
        sayHaii("Elvin", "Rahmattullah");
        sayHaii("Elvin", "Rahmattullah", "otong");

    }

    static  void sayHaii(String firstName){
        System.out.println("Haii " + firstName);
    }
    static  void sayHaii(String firstName, String secondName){
        System.out.println("Haii " + firstName +" " + secondName);
    }

    static  void sayHaii(String firstName, String secondName, String lastName){
        System.out.println("Haii " + firstName +" " + secondName +" "+ lastName);
    }
}
