package com.main;
import java.lang.String

public class Main {
    public static void main(String[] args){
        String[] nama = {"Dimas", "Fathir", "Iqbal","Riko","Imam","Ardom"};

        tampilIsiArr(nama);


        for (String i : nama) {
            System.out.println(i);
        }

    }

    public static void tampilIsiArr(String[] user){
        for (int i = 0; i < user.length; i++) {
            System.out.printf("No. %d Nama siswa : %s%n",i+1, user[i]);
        }
    }

    public static void tampilIsiArr(String user){
        for(String i : user){
            System.out.println("No. Nama siswa : "+ i);
        }
    }
}
