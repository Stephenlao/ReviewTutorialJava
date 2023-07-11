package SchoolTutorial.week3;
import java.util.*;

public class question6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a list of integer numbers separated by whitespace:");


            String input = scanner.nextLine(); // Read user input as a string

            /* Split the string into individual numbers
             This regular expression "\\s+" matches one or more whitespace characters, allowing multiple whitespaces between number
             */
            String[] numbers = input.split("\\s+");

            /*
            Create List accept integer type to store integer to list
             */

            List<Integer> uniqueNumbers = new ArrayList<>();

            for (String number : numbers) {
                // Convert each string number into real integer number using "Integer.parseInt()"
                int value = Integer.parseInt(number);

                // If the uniqueNumbers list does not contain the current integer,
                // it is added to the list using uniqueNumbers.add(value).
                // This ensures that only unique integers are stored.
                if (!uniqueNumbers.contains(value)) {
                    uniqueNumbers.add(value);
                } else {
                    /*
                    if the "uniqueNumbers" list already contains the current integer,
                    remove it from the list using uniqueNumbers.remove(Integer.valueOf(value)).
                    Integer.valueOf(value) is used to convert the int value to its corresponding Integer object.
                    This conversion is necessary because the remove() method of ArrayList expects an Object type.
                     */
                    uniqueNumbers.remove(Integer.valueOf(value));

                }
            }

            // Print the unique numbers
            System.out.println("The integers that are not duplicated are:");
            // After all integers are added in this list run for loop
            // again to print each number
            for (int number : uniqueNumbers) {
                System.out.print(number + " ");
            }
        }
    }

