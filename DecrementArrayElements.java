import java.util.Arrays;

public class DecrementArrayElements {

    public static int[] decrementArrayElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 1;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 3, 8};

        int[] result = decrementArrayElements(arr);

        System.out.println("Array after decrementing each element :");
        System.out.println(Arrays.toString(result));
    }
}
