package com.main;


public class Main {
    public static void main(String[] args) {
        System.out.println("tess aja dulu");

        var contohObjectPerson = new Person();

        contohObjectPerson.name = "Elvira";
        contohObjectPerson.address = "Batu kambing";
        contohObjectPerson.umur = 18;


        System.out.println(contohObjectPerson.name);
        System.out.println(contohObjectPerson.address);
        System.out.println(contohObjectPerson.umur);
        System.out.println(contohObjectPerson.country);

        contohObjectPerson.sayHello("Elfina");
    }
}
