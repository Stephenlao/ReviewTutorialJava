package TomTutorial.week4.question1;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public void visualise() {
        if(width > 0 && height > 0) {
            for(int i = 0; i < height; i++) {
                for(int j = 0; j < width; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else if (height <0 && width > 0) {
            System.out.println("Warning: input height is negative!");
            for(int i = 0; i < width; i++) {
                System.out.print("*");
            }
        } else {
            System.out.println("Warning: input width is negative!");
            for(int j = 0; j < height; j++) {
                System.out.print("*\n");
            }
        }
    }
}
