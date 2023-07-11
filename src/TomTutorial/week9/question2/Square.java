package TomTutorial.week9.question2;

public class Square extends Rectangle {
    public Square(){}
    public Square(double side) {
        super(side,side);
    }
    public Square(double side, String color, boolean filled) {
        super(side,side,color,filled);
    }
    public double getSide() {
        return this.getWidth();
    }
    public void setSide(double side) {
        this.setLength(side);
        this.setWidth(side);
    }
    public void setWidth(double side) {
        this.setSide(side);
    }
    public String toString() {
        return String.format("%s",super.toString());
    }
}
