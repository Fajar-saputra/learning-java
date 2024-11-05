package com.main;

public class Main {
    public static void main(String[] args) {
        System.out.println("tes");
        System.out.printf("luas = %d \n", hitungLuas(35,52));

        sapaMereka("Dimas");

    }
    // function dengan return
    public static int hitungLuas(int x,int y){
        return x * y;
    }

    // function void
    public static void sapaMereka(String input){
        // Menggunakan printf untuk format string
        System.out.printf("Apa kabar kamu %s%n", input);
    }
}
