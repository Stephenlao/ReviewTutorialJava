package OnlineTest1.question3;

public class ExpressDelivery extends Service {
    static final double cost = 4;

    public ExpressDelivery(double distance) {
        super(distance, cost, "booked");
    }

    public String toString() {
        return String.format("%s, FoodDeliveryService", super.toString());
    }
}
