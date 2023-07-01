package week7.question1;
import java.util.Scanner;
public class DrawRectangleV2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        System.out.println("Enter length: ");
        int length = scanner.nextInt();
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < length; j++) {
                if (i == 0 || i == width -1 || j == 0 || j == length-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
