abstract class Animal {
    public abstract void makeSound();
    public void eat() {
        System.out.println("I can eat.");
    }

}
class Cow extends Animal {
    public void makeSound() {
        System.out.println("Moo");
    }
    @Override
    public void eat() {
        System.out.println("I eat grass.");
    }
}

public class Main {
    public static void main(String[] args) {
        Cow cow1 = new Cow();
        cow1.makeSound();
        cow1.eat();
    }
}