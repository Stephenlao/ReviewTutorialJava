package TomTutorial.week4.question3;
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point target) {
        double distance = Math.sqrt(Math.pow(x- target.x,2)+ Math.pow(y-target.y,2));
        return distance;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
}
