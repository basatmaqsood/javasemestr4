import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;
        int index = Arrays.binarySearch(arr, key);
        System.out.println("Index of " + key + " is " + index);
    }
}