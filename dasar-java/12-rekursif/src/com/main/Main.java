package com.main;

public class Main {
    public static void main(String[] args) {

        System.out.println(hitungFaktorial(5));

        System.out.println(hitungJumlah(5));

    }

    public static  int hitungFaktorial(int parameter){
        if (parameter == 1){
            return parameter;
        }
        return parameter * hitungFaktorial(parameter - 1);
    }

    public static int hitungJumlah(int parameter) {
        if (parameter == 0) {
            return parameter;
        }

        return parameter + hitungJumlah(parameter-1);
    }
}
