package SchoolTutorial.week6.question1andquestion2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class mainQ1andQ2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String choose = "Y";
        /*
        PrintWriter print file into pw. "True" means APPEND data into file
        "False" means OVERWRITE data (talk in case of data exist inside file).
         */
        PrintWriter pw = new PrintWriter(new FileWriter("src/SchoolTutorial/week6/question1/users.txt",true));
        while (choose.equalsIgnoreCase("Y")) {
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            System.out.println("Enter address: ");
            String address = scanner.nextLine();
            System.out.println("Enter age: ");
            int age = scanner.nextInt();
            pw.printf("Name: %s\nAddress: %s\nAge: %d\n", name,address, age);
            pw.println("---------------------");
            scanner.nextLine();
            System.out.println("Continue: Y/N ");
            choose = scanner.nextLine();
        }
        // should close write file first " pw.close() before read file in console
        // because all information should store in file first then when reading it can read all inside
        pw.close();
        Scanner rf = new Scanner(new File("src/SchoolTutorial/week6/question1/users.txt"));
        System.out.println("Read file from users.txt in console");
        while (rf.hasNext()) {
            System.out.println(rf.nextLine());
        }
        rf.close();
    }
}
