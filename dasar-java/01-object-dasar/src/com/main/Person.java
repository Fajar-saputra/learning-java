package com.main;

public class Person {
    String name;
    String address;
    int umur;
    final  String country = "indonesia";


    public  void  sayHello(String paraName) {
        System.out.printf("Hello %s, my name is %s", this.name, paraName);

    }
}
