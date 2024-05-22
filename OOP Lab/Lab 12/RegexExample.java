import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".*\\d$", "Hello1"));
        System.out.println( Pattern.matches(".*[a-z]$", "Helloa"));
        System.out.println(Pattern.matches(".*[^a-zA-Z0-9]$", "Hello!"));
    }
}