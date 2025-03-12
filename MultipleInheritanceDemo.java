// Interface A
interface InterfaceA {
    void methodA();
}

// Interface B
interface InterfaceB {
    void methodB();
}

// Class implementing both interfaces
class MultipleInheritanceDemo implements InterfaceA, InterfaceB {
    // Implementing method from InterfaceA
    public void methodA() {
        System.out.println("Method A from InterfaceA");
    }

    // Implementing method from InterfaceB
    public void methodB() {
        System.out.println("Method B from InterfaceB");
    }

    public static void main(String[] args) {
        MultipleInheritanceDemo obj = new MultipleInheritanceDemo();
        obj.methodA();
        obj.methodB();
    }
}
