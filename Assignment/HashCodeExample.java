import java.util.Arrays;

public class HashCodeExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int hash = Arrays.hashCode(arr);
        System.out.println("Hash code of array: " + hash);
    }
}