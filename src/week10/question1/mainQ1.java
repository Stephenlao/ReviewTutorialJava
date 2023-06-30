package week10.question1;
import java.util.*;
import java.io.*;
public class mainQ1 {
    public static void main(String[] args) {
        System.out.println("Enter file name: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        String directory = "src/week10/question1/";
        String filePath = directory + fileName;
        boolean mark = false;
        // line 13 mark = false
        // if it is true, break while loop
        while (!mark) {
            try(Scanner fileScanner = new Scanner(new File(filePath))) {
                while (fileScanner.hasNext()) {
                    System.out.println(fileScanner.nextLine());
                }
                System.out.println("------");
                System.out.println("Correct file name");
                mark = true;
            } catch (IOException io) {
                System.out.println("Wrong file name, please re-enter again!");
                System.out.println("Enter file name: ");
                fileName = scanner.nextLine();
                filePath = directory + fileName;
            }
        }
    }
}
