import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the principle amount");
        double principle=input.nextDouble();
        System.out.println("Enter the rate amount");
        double rate=input.nextDouble();
        System.out.println("Enter the time");
        double period=input.nextDouble();

        double simpleInterest=(principle*rate*period)/100;
        System.out.println("the simple interest is : "+simpleInterest);
        input.close();
    }
}