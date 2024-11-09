package com.main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String[] buah = new String[5];


        for (int i = 0; i < buah.length; i++) {
        System.out.printf("No. %d masuk buah : ",i+1);
            buah[i] = userInput.nextLine();
        }

        for (String outputUser : buah){
            System.out.printf("Buah : %s%n",outputUser);
        }
    }
}
