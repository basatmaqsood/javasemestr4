import java.util.Arrays;

public class CopyOfRangeExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] copy = Arrays.copyOfRange(arr, 1, 3);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Copied array: " + Arrays.toString(copy));
    }
}