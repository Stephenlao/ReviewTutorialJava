package OnlineTest1.question3;

public class Service {
    private double distance;
    private double cost;

    private String status;

    public Service(double distance, double cost, String status) {
        this.distance = distance;
        this.cost = cost;
        this.status = status;
    }

    public double calculateDistance() {
        double calculateDistance = distance * cost;
        return calculateDistance;
    }
    public double getDistance() {
        return distance;
    }
    public void setDistance(int distance) {
        this.distance = distance;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return String.format("Service: distance=%.2f, status:%s, cost=%.2f",this.getDistance(),this.getStatus(),this.calculateDistance());
    }
}
