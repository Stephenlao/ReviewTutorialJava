package SchoolTutorial.week6.question3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class mainQ3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter major: ");
        String major = scanner.nextLine();
        System.out.println("Enter GPA: ");
        double gpa = scanner.nextDouble();
        Student student = new Student(name,major,gpa);
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/SchoolTutorial/week6/question3/student.obj"));
        outputStream.writeObject(student);
        System.out.println("Object written to student.obj");
    }
}
