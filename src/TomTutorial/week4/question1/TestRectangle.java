package TomTutorial.week4.question1;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        System.out.println("Enter height: ");
        int height = scanner.nextInt();
        Rectangle rectangle = new Rectangle(width,height);
        rectangle.visualise();
    }
}
