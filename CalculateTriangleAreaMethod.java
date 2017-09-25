

import java.util.Scanner;

public class CalculateTriangleAreaMethod {

             /*Create a method that calculates a triangle area by a given:
            ▪ Base
            ▪ Height
            ▪ Format the result to the second digit after the decimal separator*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        input.nextLine(); //new line to clear the input//
        double area = calculateTriangleArea(base, height);
        print(area);
    }

    private static void print(double area) {

        System.out.printf("Area = %.2f", area);
    }

    private static double calculateTriangleArea(double base, double height) {

        return (base * height) / 2;
    }
}
