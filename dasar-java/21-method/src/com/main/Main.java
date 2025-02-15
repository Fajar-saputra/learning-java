package com.main;


public class Main {
    public static void main(String[] args) {
    sayHello("Elvin");

    System.out.println(sumNumbers(500, 31));

    int[] nilaiUjian = {
            90,90,90,90,90,90
    };

    ketentuanSiswa("Elvin", nilaiUjian);
    ketentuanMahasiswa("Elvira", 90,80,88,89);

    }

//    contoh method parameter
    static  void  sayHello (String name){
        System.out.println("Hello " + name);
    }

//    contoh method return value
    static  int sumNumbers(int number1, int number2){
        return    number1 + number2;
    }

//    contoh method variable argument
//    biasa
    static  void  ketentuanSiswa(String nameSiswa, int[] nilaiAkademik){
        int totalNilai = 0;

        for (int nilai: nilaiAkademik){
            totalNilai += nilai;
        }

        int finalNilai = totalNilai / nilaiAkademik.length;

        if(finalNilai >= 90){
            System.out.println(nameSiswa+" Lulusan terbaik dengan nilai " + finalNilai);
        } else  if (finalNilai >= 80){
            System.out.println(nameSiswa+" Lulusan memuaskan dengan nilai " + finalNilai);
        } else if (finalNilai >= 70) {
            System.out.println(nameSiswa+" Lulusan dengan nilai " + finalNilai);
        } else  {
            System.out.println(nameSiswa+" Gagal dengan nilai " + finalNilai);
        }
    }

//    dengan variable argument
    static  void  ketentuanMahasiswa(String nameMahasiswa, int... nilaiAkademik){
        int totalNilai = 0;

        for (int nilai: nilaiAkademik){
            totalNilai += nilai;
        }

        int finalNilai = totalNilai / nilaiAkademik.length;

        if(finalNilai >= 90){
            System.out.println(nameMahasiswa +" Lulusan terbaik dengan nilai " + finalNilai);
        } else  if (finalNilai >= 80){
            System.out.println(nameMahasiswa +" Lulusan memuaskan dengan nilai " + finalNilai);
        } else if (finalNilai >= 70) {
            System.out.println(nameMahasiswa +" Lulusan dengan nilai " + finalNilai);
        } else  {
            System.out.println(nameMahasiswa +" Gagal dengan nilai " + finalNilai);
        }
    }
}
