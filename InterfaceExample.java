interface PAnimal {
    void sound();
}

class PetDog implements PAnimal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

 class InterfaceExample {
    public static void main(String[] args) {
        PetDog d = new PetDog();
        d.sound();
    }
}
