// Define a class named Person
class Person {
    String name;
    int age;

    // Constructor to set name and age
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create object of Person class
        Person p = new Person("Asmin Paudel", 21);

        // Call method
        p.displayInfo();
    }
}
