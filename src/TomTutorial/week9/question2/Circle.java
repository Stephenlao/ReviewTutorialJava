package TomTutorial.week9.question2;

public class Circle extends Shape {
    protected double radius = 1;
    public Circle() {
        this.radius = 1;
    }
    public Circle(double radius ) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(this.getRadius(),2) * Math.PI;
    }
    public double getPerimeter() {
        return 2 * this.getRadius() * Math.PI;
    }
    public String toString() {
        return String.format("%s, radius: %.2f",super.toString(),this.getRadius());
    }
}
