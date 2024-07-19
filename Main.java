class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
// Inheritance is done here
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
public class Main {
    public static void main(String[] args) {
        // Object is created here
        Animal a1 = new Animal();
        a1.eat();

        Dog d1 = new Dog();
        d1.eat(); // The Dog class inherits the eat method from Animal
        d1.bark();
    }
}
