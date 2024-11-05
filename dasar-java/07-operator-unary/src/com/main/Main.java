package com.main;

public class Main {
    public static void main(String[] args) {
        // operator unary
        // unary + dan -
        int misalAngka = 10;
        System.out.printf("Jika %d di unary - maka %d \n", misalAngka, -misalAngka);
        System.out.printf("Jika %d di unary + maka %d \n", misalAngka, +misalAngka);

        // unary decrement dan increment
        int misalDecrement = 10;
        System.out.printf("Contoh decrement dari %d menjadi %d\n",misalDecrement, ++misalDecrement);
        int misalIncrement = 10;
        System.out.printf("Contoh increment dari %d menjadi %d \n", misalIncrement,misalIncrement--);
        System.out.printf("Contoh increment dari %d menjadi %d \n", misalIncrement,misalIncrement);

        // unary !
        boolean misalFalse = false;
        System.out.printf("Contoh unary ! dari %b menjadi %b \n", misalFalse,!misalFalse);

    }
}
