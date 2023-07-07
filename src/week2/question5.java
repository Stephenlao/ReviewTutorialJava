package week2;
import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter circle1's center x-, y coordinates, and radius: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double radius1 = scanner.nextDouble();
        System.out.println("Enter circle2's center x-, y coordinates, and radius: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double radius2 = scanner.nextDouble();
        double distance = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        if (distance < Math.abs(radius1-radius2)) {
            System.out.println("Circle2 is inside cirlce1");
        } else if (distance <= radius1 + radius2) {
            System.out.println("Circle2 is overlap circle1");
        }
    }
}
