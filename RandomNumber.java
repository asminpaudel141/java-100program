import java.util.Random;
// How to Generate random number in Java Program
class RandomNumber{
    public static void main(String[] args) {
        Random ran=new Random();
        int randomNum=ran.nextInt(100);
        System.out.println("Your Random Number is "+randomNum);
    }
}