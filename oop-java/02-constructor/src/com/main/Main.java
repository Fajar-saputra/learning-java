package com.main;

public class Main {
    public static void main(String[] args) {

        var exampleObject1 = new Person("Elvira", "Padang", 19);
        var exampleObject2 = new Person("Elfina", "Padang");
        var exampleObject3 = new Person("Elvin");

        exampleObject1.sayHello();
        exampleObject2.sayHello();
        exampleObject3.sayHello();
    }
}
