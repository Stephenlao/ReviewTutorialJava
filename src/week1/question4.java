package week1;
import java.util.Scanner;
public class question4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coordinates of A:");
        int xA = scanner.nextInt();
        int yA = scanner.nextInt();
        System.out.println("Enter coordinates of B:");
        int xB = scanner.nextInt();
        int yB = scanner.nextInt();
        double d = Math.sqrt(Math.pow(xA-xB,2)+ Math.pow(yA-yB,2));
        double circumference = d * 4;
        double area = d * d;
        System.out.printf("Circumference: %.2f\n",circumference);
        System.out.printf("Area: %.2f\n",area);
    }
}
