package com.main;

import  java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) {
        StringBuilder defaultCapicity = new StringBuilder();
        System.out.println("capacity Default :" +defaultCapicity.capacity());

        StringBuilder strBuilder = new StringBuilder("Ini contoh kalimat dari String Builder");
        dispalyData(strBuilder);

//        append
        strBuilder.append("tess aja");
        dispaly(strBuilder);

//      lastIndexOf
        strBuilder.lastIndexOf("ini",1);
        dispaly(strBuilder);

//        delete
        strBuilder.delete(0,3);
        dispaly(strBuilder);
    }

    

    public static  void dispalyData(StringBuilder variable){
        System.out.println("Isi      :" +variable);
        System.out.println("lenght   :" +variable.length());
        System.out.println("capacity :" +variable.capacity());

        int addressVariable = System.identityHashCode(variable);
        System.out.println("Address  : "+Integer.toHexString(addressVariable));

    }

    public  static  void  dispaly(StringBuilder str){
        System.out.println(str);
    }
}
