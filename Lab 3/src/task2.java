import java.util.Scanner;

public class task2 {

    public static int dotProduct(int[] array1, int[] array2) {
        // Check if the arrays have the same length
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Arrays must have the same length");
        }

        // Calculate the dot product
        int result = 0;
        for (int i = 0; i < array1.length; i++) {
            result += array1[i] * array2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get user input for the first array
        System.out.print("Enter elements for the first array (comma-separated): ");
        String input1 = scanner.nextLine();
        String[] elements1 = input1.split(",");
        int[] array1 = new int[elements1.length];
        for (int i = 0; i < elements1.length; i++) {
            array1[i] = Integer.parseInt(elements1[i]);
        }

        // Get user input for the second array
        System.out.print("Enter elements for the second array (comma-separated): ");
        String input2 = scanner.nextLine();
        String[] elements2 = input2.split(",");
        int[] array2 = new int[elements2.length];
        for (int i = 0; i < elements2.length; i++) {
            array2[i] = Integer.parseInt(elements2[i]);
        }

        // Calculate and print the dot product
        int result = dotProduct(array1, array2);
        System.out.println("Dot Product: " + result);

        // Close the Scanner
        scanner.close();
    }
}
