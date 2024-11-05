package com.main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // variable
        Scanner totalUser = new Scanner(System.in);
        int belanjaUser = 0;

        System.out.println("------- Program Kasir -------");
        System.out.print("Total belanja anda : Rp. ");
        belanjaUser = totalUser.nextInt();

        if (belanjaUser >= 100000){
            System.out.println("Selamat anda dapat voucher");
        } else {
            System.out.println("Terima kasih.....");
        }
    }
}