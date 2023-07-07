package week1;
import java.util.Scanner;
public class question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueAsk = true;
        while(continueAsk) {
            System.out.print("Enter a positive integer: ");
            int numberInput = scanner.nextInt();
            if (numberInput == 0 || numberInput <0) {
                System.out.println("Goodbye!");
                continueAsk = false;
                break;
             }
            if(numberInput % 5 == 0 && numberInput % 6 == 0) {
                System.out.printf("%d is divisible by both 5 and 6\n",numberInput);
            } else if (numberInput % 5 == 0 || numberInput % 6 == 0) {
                System.out.printf("%d is divisible by 5 or 6, but not both\n",numberInput);
            } else {
                System.out.printf("%d is neither divisible by 5 nor 6\n",numberInput);
            }

            }
        }
    }

