package com.chan;

import java.util.Scanner;

public class Armstrong_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(isArmstrong(n));
        for (int i = 100; i < 10000; i++){
            if (isArmstrong(i)){
                System.out.println(i + " ");
            }
        }

    }

    static boolean isArmstrong(int n) { //Print three digit armstrong numbers....
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }
}