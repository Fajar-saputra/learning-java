package com.Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukan angka : ");
        int user = inputUser.nextInt();


        bintangSatu(user);
        System.out.println('\n');
        bintangDua(user);
        System.out.println('\n');
        bintangSamaKaki(user);
        System.out.println('\n');
        bintangTiga(user);
    }

    public  static void bintangSamaKaki(int user){
        for (int i = 0; i < user; i++) {
            for (int j = i; j < user-1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println('\n');
        }
    }
    public  static void bintangTiga(int user){
        for (int i = 0; i < user; i++) {
            for (int j = i; j < user-1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" * ");
            }
            System.out.println('\n');
        }
    }

    public static void bintangDua(int user){
        for (int i   = 0; i < user; i  ++) {
            //System.out.printf("baris ke %d", i+1);
            for (int j = i; j < user; j++) {
                System.out.print(" 1 ");
            }
            System.out.print('\n');
        }
    }

    public static void bintangSatu(int user){
        for (int i = 0; i <= user; i++) {
              //  System.out.printf("baris ke %d", i);
                for (int j = 0; j < i; j++) {
                    System.out.printf(" %d ",i);
            }
            System.out.print('\n');
        }


    }
}
