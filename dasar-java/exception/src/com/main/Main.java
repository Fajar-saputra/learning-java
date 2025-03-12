package com.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userIndex = new Scanner(System.in);

        int[] arrayRandom = {1,2,3,4,5};

        System.out.print("Index ke : ");
        int index = userIndex.nextInt();

//        handle error exception dengan try catch exception
        try {
        System.out.printf("index dari %d adalah %d\n", index, arrayRandom[index]);
        } catch (Exception e) {
            System.out.println(e);;
        }

        System.out.println("Program selessai");
    }
}
