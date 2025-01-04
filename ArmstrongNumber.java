public class ArmstrongNumber {
    public static void main(String[] args){
        int n, original, sum=0, r;
        n=375;
        original=n;
        for(int i=0;i<n;i++){
            while (n>0) {
                r=n%10;
                sum=sum+(r*r*r);
                n=n/10;
            }
        }
        if(original==sum) {
            System.out.println("Given number is armStrong number "+original);
            
        }else{
            System.out.println("Given number is not a armStrong number "+original);
        }
    }
}
