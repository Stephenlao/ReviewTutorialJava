package week9.question1;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woooow");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("Wooooooooow");
    }
    public void greets(BigDog another) {
        System.out.println("Woooooooooooooooooooooooow");
    }
}
