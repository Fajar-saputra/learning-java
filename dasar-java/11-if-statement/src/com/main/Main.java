package com.main;

public class Main {
    public static void main(String[] args) {

        int nilai = 50;

        // if
        System.out.println("Ini contoh if");
        if (nilai > 30){
            System.out.println("hello world");
        }

        // if else
        System.out.println("Ini contoh if else");
        if (nilai > 40){
            System.out.println("Nilai besar dari 50");
        } else {
            System.out.println("Nilai kecil dari 50");
        }

        // if else if
        System.out.println("Ini contoh if else if");
        if (nilai > 40){
            System.out.println("Nilai besar dari 40");
        } else if (nilai > 30) {
            System.out.println("Nilai besar dari 30");
        } else {
            System.out.println("Nilai kecil dari 30");
        }
    }
}
