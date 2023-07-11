package TomTutorial.week9.question1;

public class mainQ1 {
    public static void main(String[] args) {
        Cat cat = new Cat("chiwawa");
        Dog dog = new Dog("corgi");
        Dog dog1 = new Dog("puddle");
        BigDog dog3 = new BigDog("black");
        BigDog dog4 = new BigDog("white");
        cat.greets();
        dog.greets();
        dog.greets(dog1);
        dog3.greets();
        dog3.greets(dog1);
        dog3.greets(dog4);
    }
}
