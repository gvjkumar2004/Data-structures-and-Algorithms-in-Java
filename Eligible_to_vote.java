package com.chan;

import java.util.Scanner;

public class Eligible_to_vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        isEligible(age);
    }

    static void isEligible(int age){
        if( age >= 18){
            System.out.println("Eligible!");
        }
        else{
            System.out.println("not eligible!");
        }
    }
}
