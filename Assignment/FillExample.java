import java.util.Arrays;

public class FillExample {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Arrays.fill(arr, 10);
        System.out.println(Arrays.toString(arr));
    }
}