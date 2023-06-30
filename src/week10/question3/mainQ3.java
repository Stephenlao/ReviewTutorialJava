package week10.question3;

public class mainQ3 {
    public Dog treatmeasDog(Animal a) {
        try {
            Dog dog = (Dog)a;
            return dog;
        } catch (Exception e) {
            System.out.println("Impossible");
            return null;
        }
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        mainQ3 dogTreater = new mainQ3();
        dogTreater.treatmeasDog(dog1);
        dogTreater.treatmeasDog(cat1);
    }
}
