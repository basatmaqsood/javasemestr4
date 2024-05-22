import java.util.Scanner;
public class Scanner_Ex {
    public static void main(String[] args) {
        Scanner scanner =    new Scanner(System.in);
        System.out.println("Enter a String: ");
        int input = scanner.nextInt();
        System.out.println("User Input is : " + input);
        if (scanner != null)
            scanner.close();
    }
}
