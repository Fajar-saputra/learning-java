package com.main;

public class Main {
    public static void main(String[] args) {


    //  switch biasa
        char nilai = 'A';

        switch (nilai) {
            case 'A':
                System.out.println("Kamu lulus dengan sangat baik");
                break;
            case 'B':
                System.out.println("Kamu lulus dengan baik");
                break;
            case 'C':
                System.out.println("Kamu lulus");
                break;
            case 'D':
                System.out.println("Tidak lulus");
                break;
            default:
                System.out.println("Kamu mungkin salah jurusan");

        }


        //  switch lamba dengan ->
        nilai = 'C';
        switch (nilai) {
            case 'A' -> System.out.println("Kamu lulus dengan sangat baik");
            case 'B'-> System.out.println("Kamu lulus dengan baik");
            case 'C' -> System.out.println("Kamu lulus");
            case 'D' -> System.out.println("Tidak lulus");
            default -> {
                System.out.println("Kamu mungkin salah jurusan");
            }
        }

        //  switch lamba dengan ->
        nilai = 'E';
        String ketentuan = switch (nilai) {
            case 'A' :
               yield "Kamu lulus dengan sangat baik";
            case 'B':
                yield "Kamu lulus dengan baik";
            case 'C':
                yield "Kamu lulus";
            case 'D' :
                yield "Tidak lulus";
            default :
                yield "Kamu mungkin salah jurusan";

        };

        System.out.println(ketentuan);
    }
}
