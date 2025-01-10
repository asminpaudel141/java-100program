public class PalindromeNumberCheck {

    public static void main(String[] args){
        int number=1331, r, rem=0;
        int original=number;

        while (number>0) {
            r=number%10;
            rem=rem*10+r;
            number=number/10;
        }

        if (rem==original) {
            System.out.println("The given no is  palindrome "+rem);
        }else{
            System.out.println("The given no is not palindrome "+rem);
        }
    }
}