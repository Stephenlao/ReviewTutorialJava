package TomTutorial.week4.question3;

import java.util.Scanner;

public class DistanceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first point x and y: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("Enter the second point x and y: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        Point x = new Point(x1,y1);
        Point y = new Point(x2,y2);
        System.out.printf("The distance between X and Y is: %.2f",x.distance(y));
    }
}
