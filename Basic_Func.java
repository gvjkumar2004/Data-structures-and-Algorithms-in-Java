package com.chan;

import java.util.Scanner;

public class Basic_Func {
    public static void main(String[] args) {
       sum();
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter the number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum of the num1 and num2 is " + sum);
    }

}
    /* return_type name () {
       //body
       return statement;
     */
