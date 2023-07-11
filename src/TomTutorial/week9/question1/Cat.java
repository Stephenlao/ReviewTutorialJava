package TomTutorial.week9.question1;

public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }
}
