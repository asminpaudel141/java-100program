public class ArmstrongNumbers {
    public static void main(String[] args){
        int num,limit=1000,rem,sum=0;
        System.out.println("ArmStrong 1 to N");
        for(int i=1;i<=limit;i++){
            num=i;
            while (num>0) {
                rem=num%10;
                sum=sum+(rem*rem*rem);
                num=num/10;
            }
            if (sum==i) {
                System.out.println(i+" ");
            }
            sum=0;
        }
    }
}
