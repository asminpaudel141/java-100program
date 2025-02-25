class Animal{
    // method to be override
    void makeSound(){
        System.out.println("Animal makes sound ");
    }
}

    // subclass overriding the method
class Dog  extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog barks");
    }
}    

// Another subclass overriding the method
class Cat extends Animal {
    @Override
    void makeSound(){
        System.out.println("cat meowa");
    }    
}

// main class to test override
public class MethodOverridingDemo {
    public static void main(String[] args) {
    Animal myAnimal=new Animal();
    myAnimal.makeSound();

    Dog myDog=new Dog();
    myDog.makeSound();

    Cat myCat=new Cat();
    myCat.makeSound();

    }
}