package TomTutorial.week4.question4;

import TomTutorial.week4.question3.Point;

import java.util.Scanner;

public class Point2D {
    private int x;
    private int y;

    // this.x and this.y is "private int x" and
    // private int y", respectively
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point2D(Point2D p) {
        this.x = p.x;
        this.y = p.y;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X: ");
        int x = scanner.nextInt();
        System.out.println("Enter Y: ");
        int y = scanner.nextInt();
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return String.format("(%d,%d)", this.getX(), this.getY());
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public boolean isOrigin() {
        if(this.x == 0 && this.y == 0) {
        }
        return true;
    }

    public double distance(Point2D p) {
        double distance = Math.sqrt(Math.pow(this.x - p.x,2)+Math.pow(this.y-p.y,2));
        return distance;
    }

    public static double distance(Point2D p1, Point2D p2) {
        double distance = Math.sqrt(Math.pow(p1.x - p2.x,2)+Math.pow(p1.y-p2.y,2));
        return distance;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
