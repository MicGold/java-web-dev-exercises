package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a radius");
        Double radius = input.nextDouble();
        Double area = Circle.getArea(radius);
        System.out.println("the area of the circle with radius " + radius + " is: " + area);

    }
}
