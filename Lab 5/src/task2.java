import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the first number
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        // Ask the user to enter 10 more numbers
        int[] numbers = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Count the occurrences of the first number
        int count = 0;
        for (int num : numbers) {
            if (num == firstNumber) {
                count++;
            }
        }

        // Print the number of occurrences
        System.out.println("The number of occurrences of " + firstNumber + " is: " + count);
    }
}