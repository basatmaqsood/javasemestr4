import java.util.Scanner;
import java.util.regex.*;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a time in 12-hour format (e.g., 12:15 AM): ");
        String input = scanner.nextLine();
        
        boolean isValid = isValidTime(input);
        
        if (isValid) {
            System.out.println("The entered time is valid.");
        } else {
            System.out.println("The entered time is not valid.");
        }
        
        scanner.close();
    }

    public static boolean isValidTime(String str) {
        // Regular expression pattern to validate time in 12-hour format
        String regex = "^(1[0-2]|0?[1-9]):([0-5][0-9])\\s?(AM|PM|am|pm)$";

        // Creating a pattern object
        Pattern pattern = Pattern.compile(regex);

        // Match the input string with the pattern
        Matcher matcher = pattern.matcher(str);

        // Return true if the input string matches the pattern, otherwise false
        return matcher.matches();
    }
}
