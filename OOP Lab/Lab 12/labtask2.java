import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class labtask2 {
    public static void main(String[] args) {
        String filePath = "input.txt";
        String pattern = "Hello";
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            int lineNumber = 0;
            Pattern regexPattern = Pattern.compile(pattern);
            while ((line = bufferedReader.readLine()) != null) {
                lineNumber++;
                Matcher matcher = regexPattern.matcher(line);
                while (matcher.find()) {
                    System.out.println("Line " + lineNumber + ":");
                    System.out.println("Matched: " + matcher.group() + " Start at " + matcher.start() + " and ends at "
                            + matcher.end() + "");
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}