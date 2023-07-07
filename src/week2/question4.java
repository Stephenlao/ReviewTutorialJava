package week2;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class question4 {
    public static void main(String[] args) {
        double totalSpent = 3.3;

        double[] amounts = calculatePayments(totalSpent);


        System.out.println("Total Spent: " + totalSpent);
        System.out.println("Amount to Pay:");
        for (int i = 0; i < amounts.length; i++) {
            System.out.printf("Friend %d : %.2f\n", i+1, amounts[i]);
        }
    }
    public static double[] calculatePayments(double totalSpent) {
        /*
         double[] means create array contains double value inside
         new double[3] means create 3 values inside array ([0.0, 0.0, 0.0])
         */
        double[] amounts = new double[3];
        double equalAmount = (totalSpent / 3.0 );

        if (totalSpent % 3 == 0) {
            // If the equal amount is already divisible by 3, everyone pays the equal amount
            for (int i = 0; i < amounts.length; i++) {
                amounts[i] = equalAmount;
            }
        } else {
            // If the equal amount is not divisible by 3, distribute the difference among friends
            double roundedEqualAmount = Math.floor(equalAmount * 100.0) / 100.0;
            double difference = totalSpent - (roundedEqualAmount * 3.0);

            // Determine the friend who will pay the larger share
            int friendWithExtraPayment = (int) (Math.random() * 3);

            /*
            amounts.length is also 3 values inside ([0.0, 0.0, 0.0])
            using for loop the value inside would be change
             */
            for (int i = 0; i < amounts.length; i++) {
                if (i == friendWithExtraPayment) {
                    amounts[i] = roundedEqualAmount + difference;
                } else {
                    amounts[i] = roundedEqualAmount;
                }
            }
        }

        return amounts;
    }

}
