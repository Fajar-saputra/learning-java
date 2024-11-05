package com.main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        int panjang, lebar;
        int luas;

        System.out.println("Ini contoh penggunaan input dari user");
        System.out.println("====== LUAS PERSEGI PANJANG ======");
        System.out.print("Input Panjang : ");
        panjang = inputUser.nextInt();
        System.out.print("Input lebar   : ");
        lebar = inputUser.nextInt();
        System.out.println("====== HASIL ======");
         luas = panjang * lebar;
        System.out.printf("%d * %d = %d", panjang,lebar,luas);
    }
}