import java.util.Scanner;

public class task2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to search for X : ");
        String input = sc.nextLine();
        StringBuffer sb = new StringBuffer(input);
        check(sb);
        sc.close();
    }

    public static void check(StringBuffer sb) {
        int index = sb.indexOf("x");
        if (index == -1) {
            System.out.println("x not found");
        } 
        else {
            System.out.println("x found at index " + index);
        }
        String st = sb.substring(index + 1);
        System.out.println(st);
        int index2 = st.indexOf("x", index + 1);
        if (index2 == -1) {
            System.out.println("Second x not found");
        } else {
            System.out.println("Second x found at index " + index2);
        }
    }
}