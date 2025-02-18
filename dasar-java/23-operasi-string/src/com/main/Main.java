package com.main;

import java.util.Scanner;
import  java.lang.String;

public class Main {
    public static void main(String[] args) {

        String kalimat = "saya makan nasi";

//        ambil kompoenen dari kalimat
        System.out.println(kalimat.charAt(1));

//        substring
        System.out.println(kalimat.substring(0,5));

//        lowercase dan uppercase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());

//        panjang String
        System.out.println(kalimat.length());

        //        comparasi
        String kata1 = "a";
        String kata2 = "f";
        System.out.println(kata1.compareTo(kata2));

//        equality (persamaan)
//        ini akan saya karena string yang dibuat seperti ini akan disimpan dimemori hit
//        perbandingan ini dilakukan hanya membandingkan alamat address bukan dari string
        String kataInput = "test";
        String kataTest = "test";

        if (kataTest == kataInput){
            System.out.println("sama");
        } else {
            System.out.println("tidak");
        }


//        untuk membandingkan kata berdaarkan huruf walaupun kata tersebut dari user (memory poll)
//        lebih baik menggunakan equals()
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Ini input user : ");
        String input = inputUser.next();

        if (input.equals(kataTest)){
            System.out.println("kata sama menggunakan equals()");
        } else  {
            System.out.println("kata tidak sama menggunakan equals()");
        }

//        jika tidak equals()
        if (input == kataTest){
            System.out.println("kata sama tanpa equals()");
        } else {
            System.out.println("kata tidak sama tanpa equals()");
        }


        System.out.println(kalimat.lastIndexOf(1,2));
    }
}
