public class Factorial_Number {
    public static void main(String[] args){
        int number=6, factorial=1;
        for (int i=1;i<=number;i++){
            factorial*=i;
        }
        System.out.println(factorial);
    }
}