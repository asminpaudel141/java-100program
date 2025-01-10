public class SecondLargest {
    public static void main(String[] args){
        int arr[]={14,48,36,66,85,46,47,86,92};
        int largest=arr[0];
        int SecondLargest=arr[0];

        for(int i=0;i<arr.length;i++){
            if (arr[i]>largest) {
                SecondLargest = largest;
                largest=arr[i];
            }
        }
        System.out.println("The Second Largest number is "+SecondLargest);
    }
}
