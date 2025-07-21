import java.util.Scanner;

class SwapNumber{
    public static void main(String[] args) {
        int x, y;
        System.out.println("Enter the number x and y ");
        Scanner in = new Scanner(System.in);

        x=in.nextInt();
        y=in.nextInt();

        System.out.println("Before number area x = "+x+" y = "+y);

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("number of x = "+x+" y = "+y);
    }
}