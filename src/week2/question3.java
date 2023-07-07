package week2;
import java.util.Scanner;
// write method to calculate the square root number "calculateSquareRoot"
public class question3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a positive number greater than 1: ");
            double number = scanner.nextDouble();
            scanner.close();

            double result = calculateSquareRoot(number);
            System.out.println("Square root of " + number + " is: " + result);
        }

        public static double calculateSquareRoot(double number) {
            double min = 1.0;
            double max = number;

            while (true) {
                double avg = (min + max) / 2.0;
                if (avg * avg > number) {
                    max = avg;
                } else if (avg * avg < number) {
                    min = avg;
                } else {
                    return avg;
                }
            }
        }
}
