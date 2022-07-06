package com.chan;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        System.out.println("The greatest of these three numbers is " + Maximum(num1, num2, num3));
        System.out.println("The smallest of these three numbers is " + Minimum(num1, num2, num3));
    }

    static int Maximum(int num1, int num2,int num3){
        int max;
        max = num1;
        if (num2 > max){
            max = num2;
        }
        if (num3 > max){
            max = num3;
        }
        return max;
    }
    static int Minimum(int num1, int num2,int num3){
        int min;
        min = num1;
        if (num2 < min){
            min = num2;
        }
        if (num3 < min){
            min = num3;
        }
        return min;
    }

}




