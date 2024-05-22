import java.util.Arrays;

public class CopyOfExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] copy = Arrays.copyOf(arr, 5);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Copied array: " + Arrays.toString(copy));
    }
}
