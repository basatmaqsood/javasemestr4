import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account testAcct;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many accounts would you like to create?");
        int num = scan.nextInt();
        Account accounts[] = new Account[num+2]; 
        String name;
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter Name: ");
            name = scan.next();
            System.out.println("Enter Balance: ");
            double balance = scan.nextDouble();
            testAcct = new Account( balance,name);
            accounts[i] = testAcct;
        }
        System.out.println("Created "+ Account.GetAccNum() + " Accounts");
        accounts[1].close();
        accounts[num+1] = Account.consolidate(accounts[2],accounts[3]);
        scan.close();
    }
}
