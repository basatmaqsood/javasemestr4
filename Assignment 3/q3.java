import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String filePath = "hello.txt";

        // Get the pattern from the user
        System.out.print("Enter the pattern to match: ");
        String patternString = scanner.nextLine();

        // Compile the pattern
        Pattern pattern = Pattern.compile(patternString);

        try {
            // Open the file
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            // Read lines from the file and match against the pattern
            String line;
            System.out.println("Matched Patterns are: ");
            while ((line = reader.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    System.out.println(line); // Print the line if it matches the pattern
                }
            }

            // Close the file reader
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
