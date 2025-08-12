// Display odd numbers between 1 -100 
public class odd_number {
    public static void main(String[] args){
        System.out.println("The odd number are");
        for(int i=0;i<100;i++){
            if (i%2!=0) {
                System.out.println(i);
            }
        }
    }
}