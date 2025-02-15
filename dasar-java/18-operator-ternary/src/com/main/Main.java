package com.main;

public class Main {
    public static void main(String[] args) {

//        penggunaan if
        int nilaiSiwa = 90;
        if (nilaiSiwa >= 75){
            System.out.println("bagus");
        } else  {
            System.out.println("jelek");
        }

//        penggunaan operator ternary
        nilaiSiwa = 40;
        String ketentuan = nilaiSiwa >= 50? "Bagus" : "jelek";

        System.out.println(ketentuan);
    }
}
