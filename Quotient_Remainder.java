import java.util.Scanner;

public class Quotient_Remainder{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the divided: ");
        int divided=input.nextInt();

        System.out.println("Enter the divisor");
        int divisor=input.nextInt();

        int quotient=divided/divisor;
        int remainder=divided%divisor;

        System.out.println("the quotient is "+quotient);
        System.out.println("the remainder is "+remainder);
        input.close();
    }
}
