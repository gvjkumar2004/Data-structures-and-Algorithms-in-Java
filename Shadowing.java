package com.chan;

public class Shadowing {
    static int x = 90; // This will be shadowed at line 8.
    public static void main(String[] args) {
        System.out.println(x); //90
        int x; // The class variable at line 4 is shadowed by this (declared a variable x)
//      System.out.println(x); Scope will begin only when the value has been initialized, we cannot access the value between the declaration and initialization.
        x = 40; // (Initialized the variable x)
        System.out.println(x); //40
        func();
    }
    static void func (){
        System.out.println(x);
    }
}
