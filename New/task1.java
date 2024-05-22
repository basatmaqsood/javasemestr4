import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password: ");
        String input = sc.nextLine();
        StringBuffer sb = new StringBuffer(input);
        validatepassword(sb);
        sc.close();
    }

    public static void validatepassword(StringBuffer sb) {
        int DigitCount = 0;
        if (sb.length() < 8) {
            System.out.println("Password length is less than 8");
            return;
        }
        for (int i = 0; i < sb.length(); i++) {
            char character = sb.charAt(i);
            if (!Character.isLetterOrDigit(character)) {
                System.out.println("Password must contain letter and digits");
                return;
            } else if (character >= '0' && character <= '9') {
                DigitCount++;
            }
        }
        if (DigitCount < 2) {
            System.out.println("Password must contain atleast 2 digits");
            return;
        }
        System.out.println("Password is valid");

    }

}
