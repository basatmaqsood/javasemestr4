import java.util.Scanner;
public class task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int n = sc.nextInt();
        String[] str = new String[n];
        System.out.println("Enter the strings: ");
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println("The sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }
        sc.close();
    }
}
