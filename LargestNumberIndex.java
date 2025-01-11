public class LargestNumberIndex {
    public static void main(String[] args) {
        int nums[]={5,34,78,3,45,1,99,23};
        int index=0;
        int largest=nums[0];
        for(int i=0;i<nums.length;i++){
            if (largest<nums[i]) {
                largest=nums[i];
                index=i;
            }
        }
        System.out.println("The largest number index is :"+index);
    }
}
