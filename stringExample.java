package com.chan;

import java.util.Scanner;

public class stringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = in.next();
       String personalized = myGreet(name);
        System.out.println(personalized);
    }
    static String myGreet(String name){
           String message = "Hello " + name;
           return message;
    }
}

