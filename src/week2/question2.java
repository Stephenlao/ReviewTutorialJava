package week2;
import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for drawing square version 2: ");
        int numberInput = scanner.nextInt();
        for(int i = 1; i <= numberInput; i++) {
            for(int j = 1; j <= numberInput; j++) {
                if (i == 1 || i == numberInput || j == 1 || j == numberInput) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
