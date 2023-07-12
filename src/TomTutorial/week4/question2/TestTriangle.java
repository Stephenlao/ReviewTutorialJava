package TomTutorial.week4.question2;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers for the sides of a triangle: ");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        Triangle triangle = new Triangle(side1,side2,side3);
        System.out.println(triangle.verify());
    }
}
