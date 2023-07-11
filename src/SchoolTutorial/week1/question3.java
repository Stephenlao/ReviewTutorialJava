package SchoolTutorial.week1;
import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter second: ");
        int secondInput = scanner.nextInt();
        int hour = secondInput / 3600;
        int minute = (secondInput % 3600) / 60;
        int second = (secondInput % 3600) % 60;
        System.out.printf("%d:%d:%d",hour,minute,second);
    }
}
