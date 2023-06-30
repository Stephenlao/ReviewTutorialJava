package week10.question2;
import java.io.IOException;
import java.util.*;
public class mainQ2 {
    public int getIntFromUser (int defaultValue) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter integer number: ");
            int userInput = scanner.nextInt();
            System.out.println("Integer: " + userInput);
            return userInput;
        } catch(Exception e) {
            System.out.println("Invalid type of number, accept integer only!");
            System.out.println("Default value:" + defaultValue);
            return defaultValue;
        }
    }
    public static void main(String[] args) {
        int defaultVal = 8;
        mainQ2 userInput = new mainQ2();
        userInput.getIntFromUser(defaultVal);
    }

}
