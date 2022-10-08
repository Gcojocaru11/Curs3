package org.example;

import jdk.jshell.execution.Util;

import java.util.concurrent.ForkJoinPool;

public class Course03 {
    static int x = 0;

    public static void main(String[] args) {
        final double PI = 3.14;
        final int MAX_SIZE = 100;        // naming convention, all uppercase split by " _ "
        int y = 1;
        String name = "George";
        y = y + 5;

        float a = 100.4f;
        double b = 100.4f;

        boolean myBool = true;
        char myChar2 = 97;


        System.out.println("Hello course 03!");
        System.out.println(name);
        System.out.println("My name is " + name);

        System.out.println(args[0] + args[1]);
        System.out.println(args[0] + " " + args[1]);
        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
        System.out.println(args[2]);
        System.out.println(myBool);
        System.out.println(myChar2);
        if (x > 5) {
            System.out.println("Number is greater than 5");
        }
       if (y < MAX_SIZE) {
            System.out.println("Number is less than " + MAX_SIZE);
        } else {
            System.out.println("Number excedes the max size of " + MAX_SIZE);
        }

        switch (y) {
            case 0: { //y==0 --> TRUE
                System.out.println("Number is 0");
                break;
            }
            case 1: {  // y==1 --> True
                System.out.println("Number is 1");
                break;
            }
            default: {
                System.out.println("Not 0 not 1");
            }
        }
        int index = 0;
        while (myBool) {
            System.out.println("Infinite loop" + index);
            if (index > 10) {
                myBool = false;
            }

            index++;
        }
        int sum = 0;
        for (int i=1 ; i<101 ; i++) {
            sum = sum + i; // sum += i;
        }
        System.out.println("Suma este " + sum );

        final int MAX_NUMBER = 1000000;
        int countPrime = 0;
        for (int i=2; i < MAX_NUMBER ; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i / 2 ; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            if (isPrime) {
                System.out.println("Number " + i + "is prime");
                countPrime++;
            }
                else {
                System.out.println("Number " + i + "is even");
            }

            }
        }
        System.out.println("Total number of primes are" + countPrime);

    }
}
