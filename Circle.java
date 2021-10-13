/*
 * Circle formulas
 */

import java.util.Scanner;

class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of a circle in centimeters:");
        double radius = in.nextDouble();

        //TODO: write code to calculate and print the circumference and area
        //of the circle rounded to 1 decimal place (nearest tenth)
        //Note: use Math.PI for the value of pi in your calculations
        double circumference = 2 * Math.PI * radius;
        System.out.printf("Circumference = %.1f cm", circumference);

        System.out.println();

        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Area = %.1f cm^2", area);






    }
}