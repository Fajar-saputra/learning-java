package com.main;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
            String[] names = {"elvin","elfita","elvira"};


            String joiner = String.valueOf(new StringJoiner(
                    "||","[","]"
            ));

            String name = "Elvin Rahmattullah";
        StringTokenizer nameTokenzizer = new StringTokenizer(name, "");

        while (nameTokenzizer.hasMoreTokens()){
            String nameTkz = nameTokenzizer.nextToken();
            System.out.println(nameTkz);
        }
    }
}
