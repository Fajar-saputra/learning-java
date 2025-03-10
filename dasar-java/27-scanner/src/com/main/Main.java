package com.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Namamu : ");
        String name = userInput.nextLine();

        System.out.println("Your name: " + name);
    }
}
