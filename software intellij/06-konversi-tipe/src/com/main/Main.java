package com.main;

public class Main {
    public static void main(String[] args){
        // prgram konversi data
        int nilai1 = 460;
        System.out.printf("nilai1 = %d \n",nilai1);
        // memperluas rentang ke data yang lebih besar
        long nilai2 = nilai1;
        System.out.printf("nilai2 = %d \n",nilai2);
        /*
        memperluas rentang ke data yang lebih kecil (ini eror jika nilai yang dikonversi ke tipe
        data yang lebih dari Max tipe data tersebut)
        contoh :
        short nilaiShort = nilai_1;
         */

        // Widening Casting (Otomatis) : byte -> short -> int -> long -> float -> double
        byte nilaiByte = 120;
        System.out.printf("Nilai yang sudah dikonversi otomatis : %d \n", nilaiByte);
        int nilaiInt = nilaiByte;
        System.out.printf("Nilai yang sudah dikonversi otomatis : %d \n", nilaiInt);
        long nilaiLong = nilaiInt;
        System.out.printf("Nilai yang sudah dikonversi otomatis : %d \n", nilaiLong);
        float nilaiFloat = nilaiLong;
        System.out.printf("Nilai yang sudah dikonversi otomatis : %f \n", nilaiFloat);
        double nilaiDouble = nilaiFloat;
        System.out.printf("Nilai yang sudah dikonversi otomatis : %f \n", nilaiDouble);

        //Narrowing Casting (Manual) : double -> float -> long -> int -> char ->  short -> byte
        double iniFloat = (float)nilaiDouble;
        System.out.printf("Nilai yang sudah dikonversi manual : %f \n", iniFloat);
        long iniLong = (long)iniFloat;
        System.out.printf("Nilai yang sudah dikonversi manual : %d \n", iniLong);
        int iniInt = (int)iniLong;
        System.out.printf("Nilai yang sudah dikonversi manual : %d \n", iniInt);
        short iniShort = (short) iniInt;
        System.out.printf("Nilai yang sudah dikonversi manual : %c \n", iniShort);
        byte iniByte = (byte) iniShort;
        System.out.printf("Nilai yang sudah dikonversi manual : %d \n", iniByte);
    }
}
