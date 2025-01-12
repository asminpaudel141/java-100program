public class SmallestNumberIndex {
    public static void main(String[] args) {
        int n[]={12,44,23,56,9,23,78,13};

        int smallest=n[0];
        int index=0;

        for(int i=0;i<n.length;i++){
            if (n[i]<smallest) {
                smallest=n[i];
                index=i;
            }
        }
        System.out.println("smallest element index : "+index);
    }
}
