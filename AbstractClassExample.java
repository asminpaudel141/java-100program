// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();

    // Concrete method
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    // Implementing the abstract method
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        // Animal a = new Animal(); // Error: Cannot instantiate an abstract class
        Animal myDog = new Dog();  // Creating a Dog object
        myDog.makeSound();  // Calls Dog's implementation
        myDog.sleep();  // Calls inherited method
    }
}
