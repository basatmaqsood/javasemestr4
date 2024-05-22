import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner	scanner = new Scanner(System.in); System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        if (num==0)
            System.out.println("You entered 0: ");
        else if (num>0)
        {
            if (num%2==0)
                System.out.println("You entered Positive and even no. ");
            else
                System.out.println("You entered Positive and odd no. ");
        }
        else
        {
            if (num%2==0)
                System.out.println("You entered Negative and even no. ");
            else
                System.out.println("You entered Negative and odd no. ");
        } //else ends here
    } //main method ends here
}
