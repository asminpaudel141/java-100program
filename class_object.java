public class class_object {
    // attributes of car
    String brand;
    int year;

    void displayCarInfo(){
        System.out.println("Car Brand: "+brand);
        System.out.println("Manufacturing Year: "+year);
    }

    public static void main(String[] args) {
        class_object co=new class_object();

        co.brand="Toyota";
        co.year=2022;

        co.displayCarInfo();
    }
}
