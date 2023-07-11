package SchoolTutorial.week2;
import java.util.Scanner;
public class question1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for drawing square: ");
        int numberInput = scanner.nextInt();
        for(int i = 1; i <=numberInput; i++) {
            for(int j =1; j<=numberInput;j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
