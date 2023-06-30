package week9.question3a;

public class mainQ3a {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println(circle.getArea());
        System.out.println(circle);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle);
    }
}
