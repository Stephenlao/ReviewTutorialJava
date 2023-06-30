package week9.question2;

public class Rectangle extends Shape {
    protected double width = 1;
    protected double length = 1;
    public Rectangle() {
        this.width = 1;
        this.length = 1;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.getWidth() * this.getLength();
    }

    @Override
    public double getPerimeter() {
        return (this.getWidth() + this.getLength()) *2;
    }
    public String toString() {
        return String.format("%s,width: %.2f,length: %.2f",super.toString(),this.getWidth(),this.getLength());
    }
}
