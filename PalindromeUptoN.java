public class PalindromeUptoN {
    public static void main(String[] args){
        int limit=50;
        int number,r,rem=0;

        for(int i=1;i<=limit;i++){
            number=i;

            while (number>0) {
             
                r=number%10;
                rem=rem*10+r;
                number=number/10;
            }
            if (rem==i) {
                System.out.print(" "+i);
            }
                rem=0;
        }
    }
}
