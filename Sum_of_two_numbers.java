package com.chan;

import java.util.Scanner;

public class Sum_of_two_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();
        Product(num1, num2);

    }
    static int Product(int num1, int num2){
        int product;
        product = num1 * num2;
        System.out.println("The sum of the two numbers: " + product);
        return product;
    }
}
