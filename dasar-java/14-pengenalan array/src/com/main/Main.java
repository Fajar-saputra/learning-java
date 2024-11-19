package com.main;
import java.lang.String;

public class Main {
    public static void main(String[] args){
        String[] nama = {"Dimas", "Fathir", "Iqbal","Riko","Imam","Ardom"};
        int angka[] = {1,2,3,4,5,6,7,8,9,10};

        tampilIsiArr1(nama);
        tampilIsiArr2(nama);
        tampilIsiArr3(angka);

    }

    public static void tampilIsiArr1(String[] user){
        for (int i = 0; i < user.length; i++) {
            System.out.printf("No. %d Nama siswa : %s%n",i+1, user[i]);
        }
    }

    public static void tampilIsiArr2(String[] nama){
        for(String i : nama){
            System.out.println("Nama siswa : "+ i);
        }
    }

    public static void tampilIsiArr3(int[] angka){
        for(int namaVariableBebas : angka){
            System.out.print(namaVariableBebas);
        }
    }
}
