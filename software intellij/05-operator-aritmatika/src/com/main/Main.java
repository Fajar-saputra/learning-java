package com.main;

public class Main {
    public static void main(String[] args){
    // operasi aritmatika

        int variable1 = 7;
        int variable2 = 5;
        int hasil;

        // penjumlahan
        hasil= variable1 + variable2;
        System.out.printf("%d + %d = %d \n", variable1,variable2,hasil);

        // pengurangan
        hasil = variable1 - variable2;
        System.out.printf("%d - %d = %d \n", variable1,variable2,hasil);

        // perkalian
        hasil = variable1 * variable2;
        System.out.printf("%d * %d = %d \n", variable1,variable2,hasil);

        // pembagian
        hasil = variable1 / variable2;
        System.out.printf("%d / %d = %d \n", variable1,variable2,hasil);

        // modulus
        hasil = variable1 % variable2;
        System.out.printf("%d %% %d = %d \n", variable1,variable2,hasil);

    }
}
