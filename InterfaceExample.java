interface Animal {
    void sound();  // Abstract method
}

// Dog class implementing Animal interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Cat class implementing Animal interface
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Cow class implementing Animal interface
class Cow implements Animal {
    public void sound() {
        System.out.println("Cow moos");
    }
}

// Main class
public class InterfaceExample {
    public static void main(String[] args) {
        // Create instances using interface references (polymorphism)
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        // Call the sound method for each animal
        a1.sound();  // Output: Dog barks
        a2.sound();  // Output: Cat meows
        a3.sound();  // Output: Cow moos
    }
}
