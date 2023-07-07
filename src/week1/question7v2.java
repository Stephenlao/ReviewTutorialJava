package week1;

public class question7v2 {
    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers\t|\tKilometers\t\tMiles");
        int kmInput = 20;
        for(int i = 1; i <=10; i++) {
            double mileInput = i;
            double kilometers = milesToKilometers(mileInput);

            double miles = kmToMiles(kmInput);
            System.out.printf("%.0f\t\t\t%.2f\t\t| \t\t%d\t\t\t%.2f\n", mileInput, kilometers, kmInput, miles);
            kmInput +=5;
        }
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.609;
    }
    public static double kmToMiles(double km) {
        return km / 1.609;
    }
}
