import java.util.Scanner;
public class WHILELOOP {
    //demonstrate the while loop import java.util.Scanner; public class Loops {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        while (number >= 0) {
            sum += number;
            System.out.println("Enter a number");
            number = input.nextInt();
        }
        System.out.println("Sum = " + sum); input.close();
    }
}

}
