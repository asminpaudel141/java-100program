class Dog{
    public void bark(){
        System.out.println("woof");
    }
}

 class pug extends Dog {
    public void sniff(){
        System.out.println("sniff");
    }
    public void bark(){
        System.out.println("bow ");
    }
    public static void main(String[] args) {
        Dog ap=new Dog();
        ap.bark();
        pug op=new pug();
        op.bark();
        op.sniff();
    }
}