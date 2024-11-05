package com.main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        // variable
        float panjang,lebar;

        System.out.print("Masukan panjang : ");
        panjang = userInput.nextFloat();
        System.out.print("Masukan lebar : ");
        lebar = userInput.nextFloat();

        float luas = panjang*lebar;
        System.out.printf("Luas dari persegi panjang : %f", luas);
    }
}
