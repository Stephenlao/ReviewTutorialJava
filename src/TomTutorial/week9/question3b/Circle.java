package TomTutorial.week9.question3b;

public class Circle implements GeometricObject {
    protected double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
        @Override
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }
    public String toString() {
        return String.format("Circle[radius: %.2f]",this.radius);
    }

}
