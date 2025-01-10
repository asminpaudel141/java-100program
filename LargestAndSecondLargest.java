public class LargestAndSecondLargest {
    public static void main(String[] args) {
        int nums[] = {5,34,78,2,45,1,99,23};
        int largest=nums[0];
        int smallest=nums[0];

        for(int i=0;i<nums.length;i++){
            if (nums[i]>largest) {
                largest=nums[i];
            }
            else if (smallest>nums[i]) {
                smallest=nums[i];
            }
        }
        System.out.println("largest number is: "+largest);
        System.out.println("smallest number is: "+smallest);
    }
}
