package com.chan;

import java.util.Scanner;

public class Circle_radius_circumference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the radius: ");
        double radius = in.nextInt();
        Area(radius);
        Circumference(radius);
    }
    static double Area(double radius){
        double area;
        area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);
        return area;
    }

    static double Circumference(double radius){
        double circumference;
        circumference = Math.PI * 2 * radius;
        System.out.println("The circumference of the circle is" + circumference);
        return circumference;
    }
}
