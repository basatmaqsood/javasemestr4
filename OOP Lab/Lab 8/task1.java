import java.util.Scanner;

class finder{
     void find(String str, char ch){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println("The character "+ch+" is present "+count+" times in the string.");
        return;
    }
     void find(String s1) {
        s1 = s1.toLowerCase();
        System.out.print("Vowels present in the string are: ");
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(ch);
            }
        }
    }
}

public class task1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("Enter a character to search : ");
        char ch = sc.next().charAt(0);
        finder obj = new finder();
        obj.find(str, ch);
        obj.find(str);
        sc.close();
    }
}