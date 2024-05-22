import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        // Call the removeDuplicates method to remove duplicate words
        String result = removeDuplicates(inputSentence);

        // Print the result
        System.out.println("Sentence without duplicates: " + result);

        scanner.close();
    }

    public static String removeDuplicates(String str) {
        // Regular expression pattern to match duplicate words
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        
        // Compile the pattern
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        
        // Create a matcher
        Matcher matcher = pattern.matcher(str);
        
        // Replace duplicate words with single occurrence
        String result = matcher.replaceAll("$1");
        
        return result;
    }
}
