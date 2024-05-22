import java.util.Scanner;
import java.util.Random;

class Account {
    private double balance;
    private String name;
    private long acctNum;

    // Generate a random number;

    Random Rand = new Random();

    // ----------------------------------------------
    // Constructor -- initializes balance, owner, and account
    // ----------------------------------------------
    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
    }
    public Account(String name){
        this.name = name;
        this.acctNum = Rand.nextInt(32654);
        this.balance = Rand.nextInt(20000);
        
    }

    public Account(double balance, String name){
        this.name = name;
        this.balance = balance;
        this.acctNum = Rand.nextInt(32654);
    }
    
    // If so, decrements balance by amount; if not, prints message.
    // ----------------------------------------------
    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient funds");
    }
    public void withdraw(double amount,double fee) {
        if (balance >= amount){

        
            balance -= amount;
            balance -= fee;
        }
        else
            System.out.println("Insufficient funds");
    }


    // ----------------------------------------------
    // Adds deposit amount to balance.
    // ----------------------------------------------
    public void deposit(double amount) {
        balance += amount;
    }

    // ----------------------------------------------
    // Returns balance.
    // ----------------------------------------------
    public double getBalance() {
        return balance;
    }
    // ----------------------------------------------
    // Returns a string containing the name, account number,

    // ----------------------------------------------
    public String toString() {
        return "Name:" + name +
                "\nAccount Number: " + acctNum +
                "\nBalance: " + balance;
    }
}

public class Main {
    public static void main(String[] args) {
        String name;
        double balance;
        long acctNum;
        Account acct;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter account holder's first name");
        name = scan.next();
        acct = new Account(name);
        System.out.println("Account for " + name + ":");
        System.out.println(acct);
        System.out.println("\nEnter initial balance");
        balance = scan.nextDouble();
        acct = new Account(balance, name);
        System.out.println("Account for " + name + ":");
        System.out.println(acct);
        System.out.println("\nEnter account number");
        acctNum = scan.nextLong();
        acct = new Account(balance, name, acctNum);
        System.out.println("Account for " + name + ":");
        System.out.println(acct);
        System.out.print("\nDepositing 100 into account, balance is now ");
        acct.deposit(100);
        System.out.println(acct.getBalance());
        System.out.print("\nWithdrawing $25, balance is now ");
        acct.withdraw(25);
        System.out.println(acct.getBalance());
        System.out.print("\nWithdrawing $25 with $2 fee, balance is now ");
        acct.withdraw(25, 2);
        System.out.println(acct.getBalance());
        System.out.println("\nBye!");
        scan.close();
    }
}
