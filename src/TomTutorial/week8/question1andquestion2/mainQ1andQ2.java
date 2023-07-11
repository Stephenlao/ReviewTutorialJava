package TomTutorial.week8.question1andquestion2;

import java.util.*;
import java.io.*;
public class mainQ1andQ2 {
    //filewriter should add the IOException
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("src/TomTutorial.week8/question1/users.txt"));
        Scanner scanner = new Scanner(System.in);
        String userChoice = "Y";
        int userAge = 0;
        int userCount = 0;
        while (userChoice.equalsIgnoreCase("Y")) {
            System.out.println("Enter name: ");
            String name = scanner.nextLine();

            System.out.println("Enter address: ");
            String address = scanner.nextLine();

            System.out.println("Enter age: ");
            int age = scanner.nextInt();
            userAge += age;
            userCount ++;
            pw.printf("name: %s\naddress: %s\nage: %d\n",name,address,age);
            pw.println("----------------------------");
            scanner.nextLine(); // Consume the newline character
            System.out.println("Do you want to continue Y/N: ");
            userChoice = scanner.nextLine();
        }
        pw.close();

        System.out.println("Read users.txt file to console: ");
        Scanner fileScanner = new Scanner(new File("src/TomTutorial.week8/question1/users.txt"));
        while(fileScanner.hasNext()) {
            System.out.println(fileScanner.nextLine());
        }
        fileScanner.close();
        if(userCount > 0) {
            double averageAge = userAge / userCount;
            System.out.printf("Average age: %.2f ", averageAge);
        } else {
            System.out.println("No users enter information");
        }
    }
}
