package TomTutorial.week9.question2;

public class mainQ2 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(3,"blue", true);

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(5,10);
        Rectangle rectangle2 = new Rectangle(2,3,"green", true);

        Square square = new Square();
        Square square1 = new Square(6);
        Square square2 = new Square(6,"grey",true);

        System.out.println(circle);
        System.out.println(circle1);
        System.out.println(circle2);

        System.out.println(rectangle);
        System.out.println(rectangle1);
        System.out.println(rectangle2);

        System.out.println(square);
        System.out.println(square1);
        System.out.println(square2);


    }
}
