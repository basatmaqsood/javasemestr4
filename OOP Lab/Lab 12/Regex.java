import java.util.regex.*;

public class Regex {
    public static void main(String[] args) {
        String[] inputs = {"c", "cat", "catat", "catatat", "ct"};

        String regex = "c(at)*";

        Pattern pattern = Pattern.compile(regex);

        for (String input : inputs) {
            Matcher matcher = pattern.matcher(input);
            boolean matches = matcher.matches();
            System.out.println("Does the input " + input + " match the regex? " + matches);
        }
    }
}