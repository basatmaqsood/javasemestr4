import java.util.Arrays;

public class EqualsExample {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean result = Arrays.equals(arr1, arr2);
        System.out.println("Arrays are equal: " + result);
    }
}