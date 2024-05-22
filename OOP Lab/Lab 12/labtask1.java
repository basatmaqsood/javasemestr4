import java.io.*;
import java.util.Scanner;

public class labtask1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("sourceFile.txt"));
            FileWriter writer = new FileWriter("destinationFile.txt");

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                writer.write(line.toUpperCase());
            }

            scanner.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}