package week9.question3b;

public class mainQ3b {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle);
        System.out.println("-------------------");


        ResizeableCircle resizeableCircle = new ResizeableCircle(3);
        resizeableCircle.resize(20);
        System.out.println(resizeableCircle.getArea());
        System.out.println(resizeableCircle);





    }
}
