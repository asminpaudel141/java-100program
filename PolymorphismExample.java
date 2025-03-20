// Parent class
class Animal {
    // Method to be overridden
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class: Dog
class Dog extends Animal {
    // Overriding makeSound method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Child class: Cat
class Cat extends Animal {
    // Overriding makeSound method
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Demonstrating method overloading
class MathOperations {
    // Overloaded methods
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Main class to test polymorphism
public class PolymorphismExample {
    public static void main(String[] args) {
        // Runtime Polymorphism (Method Overriding)
        Animal myAnimal; // Parent class reference

        myAnimal = new Dog();
        myAnimal.makeSound(); // Output: Dog barks

        myAnimal = new Cat();
        myAnimal.makeSound(); // Output: Cat meows

        // Compile-time Polymorphism (Method Overloading)
        MathOperations math = new MathOperations();
        System.out.println("Sum: " + math.add(5, 10));          // Output: Sum: 15
        System.out.println("Sum: " + math.add(3.5, 2.5));      // Output: Sum: 6.0
        System.out.println("Sum: " + math.add(1, 2, 3));       // Output: Sum: 6
    }
}
