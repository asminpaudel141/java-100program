public class DigitsSum {
    public static void main(String[] arga){
        int num=12507;
        int rem=0;
        int sum=0;
        int temp;
        temp=num;
        while  (num>0) {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.print("Sum of DigitsSum "+temp+ "is "+sum);
    }
}
