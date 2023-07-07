package week1;

public class question7v1 {
    public static void main(String[] args) {
        System.out.println("Miles\t\t Kilometers");
        for (int mile = 1; mile <= 9; mile++) {
            double kilometer = mile * 1.609;
            System.out.printf("%d\t\t\t\t%.2f\n", mile, kilometer);
        }
        System.out.println();

        System.out.println("Kilometers\t\tMiles");
        for(int km = 20; km <=65; km+=5) {
            double miles = km / 1.609;
            System.out.printf("%d\t\t\t\t%.2f\n",km,miles);
        }
        }
    }
