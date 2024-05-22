import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int number = scanner.nextInt();
        System.out.println("Enter a second number ");
        int number2 = scanner.nextInt();
        int result = number + number2;
        System.out.println("The result is "+ result);
    }
}