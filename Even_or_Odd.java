package com.chan;

import java.util.Scanner;

public class Even_or_Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();

        if (n % 2 == 0){
            System.out.println("yes, it's an even number.");
        }
        else{
            System.out.println("Nope, it is not an odd number.");
        }
    }
}


