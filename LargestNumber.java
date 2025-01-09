public class LargestNumber {
    public static void main(String[] args) {
        int[] a=new int[]{20,30,50,4,71,100};
        int max=a[0];

        for(int i=0;i<a.length;i++){
            if (max<a[i]) {
                max=a[i];
            }
        }
        System.out.println("from the Array Element largest number is "+max);
    }
}
