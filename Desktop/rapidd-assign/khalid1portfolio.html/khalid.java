package com.khalid;

import java.util.*;

public class Main {
    public static int calculationSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int Multiplication(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static int Prime(int a) {
        int prime = a % a;
        if (a % a == 0) {
            System.out.println(" the first number is prime ");
        } else {
            System.out.println(" it is not prime number ");
        }
        return prime;

    }

    public static int Even(int a) {
        int Even = a % 2;
        if (a % 2 == 0) {
            System.out.println(" this even number ");
        } else {
            System.out.println("this is not even number");
        }
        return Even;

    }

    public static int table(int a) {
        int i = 1;
        int table = a * i;
        for (i = 1; i <= 10; i++) {
            System.out.println(a * i);
        }
        return table;

    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculationSum(a, b);
        int mul = Multiplication(a, b);
        int prime = Prime(a);
        int even = Even(a);
        int table = table(a);
        System.out.println(" enter the 1 to do sum \n enter the 2 for multiplication ");
        int c = sc.nextInt();
        if (c == 1) {
            System.out.println(sum);

        } else if (c == 2) {
            System.out.println(mul);
        }
    }
}
