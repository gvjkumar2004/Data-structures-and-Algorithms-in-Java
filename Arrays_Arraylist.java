package com.chan;

public class Arrays_Arraylist {
    // Main driver method
    public static void main(String args[])
    {
        // Input array
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;

        // Printing first element of array
        System.out.println(arr[0]);

        // ArrayList
        // Creating an arrayList with initial capacity
        // say bi it 2
        ArrayList<Integer> arrL = new ArrayList<Integer>(2);

        // Adding elements to ArrayList
        // using add() method
        arrL.add(1);
        arrL.add(2);

        // Printing alongside accessing
        // elements of ArrayList
        System.out.println(arrL.get(0));
    }
}
}
