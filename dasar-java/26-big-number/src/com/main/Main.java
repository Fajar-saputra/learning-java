package com.main;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger contohBigNumber1 = new BigInteger("10000000000");
        BigInteger contohBigNumber2 = new BigInteger("10000000000");

        BigInteger result = contohBigNumber1.add(contohBigNumber2);
        result = contohBigNumber1.sqrt();
        result = contohBigNumber1.subtract(contohBigNumber2);
        result = contohBigNumber1.multiply(contohBigNumber2);
        result = contohBigNumber1.divide(contohBigNumber2);
        result = contohBigNumber1.mod(contohBigNumber2);

        System.out.println(result);
    }
}
