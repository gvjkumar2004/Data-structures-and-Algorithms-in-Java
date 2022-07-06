package com.chan;

import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        int [] arr = {1, 3, 2, 45, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int [] nums) {
        nums [0] = 99; // If you make change to the object via ref.variable, Same object will be changed.
    }
}
