package week9.question3b;

public class ResizeableCircle extends Circle implements Resizable {
    public ResizeableCircle(double radius){
        super(radius);
    }

    @Override
    // this method using void so that we can not return the value
    // using "this.setRadius", it will set new value for attribute "radius"
    // then it calls back to Circle class (superclass), then we can use methods with latest radius value
    public void resize(int percent) {
        this.setRadius(this.getRadius() * percent/100.0);
    }
    public String toString() {
        return String.format("ResizableCircle%s]",super.toString());
    }
}
