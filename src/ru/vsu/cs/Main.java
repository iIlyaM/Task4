package ru.vsu.cs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {
        double n = readValue("N");
        double sum = calculateSum(n);
        printSum(sum);
    }

    private static double readValue(String name)
    {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter the value of %s: ", name);
        return scan.nextDouble();
    }

    private static double raiseANumber(double p, double k) 
    {
        double pow = 1;
        for (int i = 1; i <= k; i++) 
        {
            pow *= p;
        }
        return pow;
    }

    private static double calculateSum(double n)
    {
        double sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum += raiseANumber(i, n - i + 1);
        }
        return sum;
    }


    private static void printSum(double sum)
    {
        System.out.println("The sum of this expression is "+ sum);
    }
}
