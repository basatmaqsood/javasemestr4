import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] a = {5, 2, 4, 3, 1};
        System.out.println("Before Sorting " +Arrays.toString(a)); Arrays.sort(a);
        System.out.println("After Sorting " +Arrays.toString(a)); Arrays.fill(a, 8);
        System.out.println("After filling the sorted array a with value 8 ->"
                +Arrays.toString(a));
        int[] b = Arrays.copyOf(a, 5);
        System.out.println("After copying first 5 elements of array a in array b >" +Arrays.toString(b));
        if (Arrays.equals(a, b)) { System.out.println("Arrays a, b are equal");
        } else {
            System.out.println("Arrays a, b are not equal");
        }
    }
}
