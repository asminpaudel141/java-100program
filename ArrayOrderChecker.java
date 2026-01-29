public class ArrayOrderChecker {

    public boolean isSorted(int[] arr) {
        // check ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false; // not sorted
            }
        }
        return true; // sorted
    }

    public static void main(String[] args) {

        ArrayOrderChecker obj = new ArrayOrderChecker();

        int[] arr = {90, 80, 70, 10, 20};

        boolean result = obj.isSorted(arr);

        if (result) {
            System.out.println("Array is sorted in ascending order");
        } else {
            System.out.println("Array is NOT sorted in ascending order");
        }
    }
}
