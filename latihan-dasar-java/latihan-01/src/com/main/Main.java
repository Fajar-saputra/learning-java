package com.main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        calculator();

    }

     static  void  calculator(){

         int hasil, operandPertama, operandKedua;
         char operator;

         Scanner userInput = new Scanner(System.in);

         System.out.print("Input Angka pertama : ");
         operandPertama = userInput.nextInt();

         System.out.print("Input Angka kedua : ");
         operandKedua = userInput.nextInt();

         System.out.print("Input operator + - * / % : ");
         operator= userInput.next().charAt(0);

        switch (operator){
            case '+' -> System.out.printf("%d + %d = %d \n", operandPertama,operandKedua, hasil  = operandPertama + operandKedua);
            case '-' -> System.out.printf("%d - %d = %d \n", operandPertama,operandKedua, hasil  = operandPertama - operandKedua);
            case '*' -> System.out.printf("%d * %d = %d \n", operandPertama,operandKedua, hasil = operandPertama * operandKedua);
            case '/' -> System.out.printf("%d / %d = %d \n", operandPertama,operandKedua, hasil  = operandPertama / operandKedua);
            case '%' -> System.out.printf("%d % %d = %d \n", operandPertama,operandKedua, hasil = operandPertama % operandKedua);
            default -> System.out.println("Anda salah input");
        }

    }

}
