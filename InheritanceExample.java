// Parent class
class Parent {
    String name;

    // Constructor
    Parent(String name) {
        this.name = name;
    }

    // Method to display details
    void display() {
        System.out.println("Parent Name: " + name);
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    int age;

    // Constructor
    Child(String name, int age) {
        super(name); // Call parent class constructor
        this.age = age;
    }

    // Method to display details
    void display() {
        super.display(); // Call parent class method
        System.out.println("Child Age: " + age);
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        Child child = new Child("John", 12);
        child.display(); // Calls the display method of Child class
    }
}
