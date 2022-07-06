package com.chan;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
//        fun(2, 3, 4, 5, 6, 7); // Array(data structure)
//        multiple(2, 5, "Jayanth", "chandana priya", "Janaki kumar");
//        demo("Jayanth", "Kunal");
//        demo(1, 2, 3, 4, 56);
    }
    static void demo (int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo (String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple (int a, int b, String ...v) { // Variable length arguments must be at the end of the list.
//        System.out.println(Arrays.toString());
    }
    static void fun (int ...v){
        System.out.println(Arrays.toString(v));
    }
}
