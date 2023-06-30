package week7.question1;
import java.util.Scanner;
public class DrawRectangle {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        System.out.println("Enter length: ");
        int length = scanner.nextInt();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Thank you");
        System.out.println("see you again");
        System.out.println("see you again");
        System.out.println("see you again");
        System.out.println("see you again");
        System.out.println("see you again");
        System.out.println("see you again");
        System.out.println("see you again");

    }
}
