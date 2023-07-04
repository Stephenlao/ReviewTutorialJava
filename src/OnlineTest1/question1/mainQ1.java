package OnlineTest1.question1;
import java.util.Scanner;
public class mainQ1 {
    public void printFirstFiveAddition(int n, int m) {
        for(int i = 1; i <= 5; i++) {
            int result = n + i * m;
            System.out.printf("%d + %d * %d = %d\n", n,i,m,result);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        System.out.println("Enter m: ");
        int m = scanner.nextInt();
        mainQ1 printFiveAddition = new mainQ1();
        printFiveAddition.printFirstFiveAddition(n,m);
    }
}
