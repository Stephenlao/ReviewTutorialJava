package week9.question3a;

public class Circle implements GeometricObject {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.radius,2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }
    public String toString() {
        return String.format("Circle: [radius : %.2f]", this.radius);
    }
}
