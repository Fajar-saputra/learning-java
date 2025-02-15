package com.main;

public class Person {
    String name;
    String address;
    int umur;


    // Constructor
    Person(String name, String address, int umur){
        this.name = name;
        this.address = address;
        this.umur = umur;
    }

    //    overloading constructor
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    //    overloading constructor
    Person(String name){
        this.name = name;
    }

    //    overloading constructor
    Person(){

    }

    void sayHello(){
        System.out.printf("Hello %s \n", this.name);
    }
}
