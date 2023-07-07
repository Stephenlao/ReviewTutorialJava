package week2;
import java.util.Scanner;
public class question3Tom {
    public static String verify(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) {
            if ( a == b && b == c) {
                return "Equilateral triangle";
            } else if ( a == b || b == c) {
                return "Isosceles triangle";
            } else {
                return "Scalene triangle";
            }
        } else {
            return "Not a triangle";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 numbers of the sides of a triangle");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String verifyTriangle = verify(a,b,c);
        System.out.println(verifyTriangle);
    }
}
