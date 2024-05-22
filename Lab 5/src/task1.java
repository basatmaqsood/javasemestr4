import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][4];

        boolean continueProgram = true;

        while (continueProgram) {
            // Read input and populate the matrix
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("Enter the number for row " + (i + 1) + ", column " + (j + 1) + ": ");
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // Calculate and store sums of columns in the last row
            for (int j = 0; j < 4; j++) {
                int sum = 0;
                for (int i = 0; i < 4; i++) {
                    sum += matrix[i][j];
                }
                matrix[4][j] = sum;
            }

            // Print the matrix
            System.out.println("The matrix:");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }

            // Ask the user if they want to continue
            System.out.println("Do you want to continue? (yes/no)");
            String choice = scanner.next();
            continueProgram = choice.equalsIgnoreCase("yes");
        }
        System.out.println("Program stopped.");
    }
}