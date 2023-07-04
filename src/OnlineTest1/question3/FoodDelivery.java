package OnlineTest1.question3;

public class FoodDelivery extends Service {
    static final double cost = 2;
    public FoodDelivery(double distance) {
        super(distance,cost,"booked");
    }
    public String toString() {
        return String.format("%s, FoodDeliveryService",super.toString());
    }

}
