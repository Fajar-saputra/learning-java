package com.main;

public class Main {
    public static void main(String[] args) {
    //   while
        int counter = 1;
        while (counter < 10){
            System.out.println("tess");

            if (counter == 10){
                break;
            }
            counter++;
        }

//        do while
        counter= 1;
        do{
            System.out.println("tes do while d%");

            counter++;

        } while (counter <= 10);
    }
}
