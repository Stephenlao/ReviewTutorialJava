package TomTutorial.week9.question3a;

public class Rectangle implements GeometricObject {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }
    public String toString() {
        return String.format("Rectangle[width: %.2f, length: %.2f]",this.width, this.length);
    }
}
