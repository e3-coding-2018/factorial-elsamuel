package com.e3civichigh.coding;
import java.math.BigInteger;

public class Factorial
{
    public static void main(String[] args)
    {
        final int NUM_FACTS = 100;
        // TODO 1: Please create a for loop that counts from 0 up to NUM_FACTS
        for (int i=0; i <= NUM_FACTS; i++)
            {
                System.out.println(i + "! is " + factorial(i));
            }
    }

    public static BigInteger factorial(int n)
    {
        BigInteger factorial = BigInteger.ONE;

        for (int i = n; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        return factorial;
    }
}
