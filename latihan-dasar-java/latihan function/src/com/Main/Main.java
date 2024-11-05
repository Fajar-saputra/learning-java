package com.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
/*
        System.out.print("Masukan angka : ");
        int user = inputUser.nextInt();
*/

        bintangSatu(5);
        System.out.println('\n');
        bintangDua(5);
    }

    public static void bintangDua(int user){
        for (int i   = 0; i < user; i  ++) {
            //System.out.printf("baris ke %d", i+1);
            for (int j = user; j > 0; j--) {
                System.out.print(" * ");
            }
            System.out.print('\n');
        }
    }

    public static void bintangSatu(int user){
        for (int i = 0; i <= user; i++) {
                System.out.printf("baris ke %d", i);
                for (int j = 0; j < i; j++) {
                    System.out.print(" * ");
            }
            System.out.print('\n');
        }


    }
}
