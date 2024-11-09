package com.main;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hasil rekursif bercabang untuk n = 4:");
        int hasil = rekursifBercabang(10);
        System.out.println("Total: " + hasil);
    }

    public static int rekursifBercabang(int n) {
        // Basis rekursi
        if (n <= 1) {
            return 1;
        }

        // Rekursi bercabang
        // Cabang 1: n-1
        // Cabang 2: n-2
        return rekursifBercabang(n-1) + rekursifBercabang(n-2);
    }
}

