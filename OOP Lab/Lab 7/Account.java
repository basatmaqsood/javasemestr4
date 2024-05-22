
import java.util.Random;

class Account {
    private double balance;
    private String name;
    private long acctNum;

    private static int numAcc = 0;
    private static void AccIncrement(){
        numAcc++;
    }
    private static void AccDecrement(){
        numAcc--;
    }
    public static int GetAccNum(){
        return numAcc;
    }

    // Generate a random number;

    Random Rand = new Random();

    // ----------------------------------------------
    // Constructor -- initializes balance, owner, and account
    // ----------------------------------------------
    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
        AccIncrement();
    }
    public Account(String name){
        this.name = name;
        this.acctNum = Rand.nextInt(32654);
        this.balance = Rand.nextInt(20000);
        AccIncrement();
    }

    public Account(double balance, String name){
        this.name = name;
        this.balance = balance;
        this.acctNum = Rand.nextInt(32654);
        AccIncrement();
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


    public static Account consolidate (Account acc1, Account acc2){
        if(acc1.name.equals( acc2.name)){
            System.out.println("Same Account name cannot be merged.");
            return null;
        }
        else if(acc1.acctNum == acc2.acctNum){
            System.out.println("Same Account number cannot be merged.");
            return null;
        }
        else{
            double balance = acc1.balance + acc2.balance;
            Account acc3 = new Account(balance,acc1.name);
            System.out.println("Account Consolidated");
            return acc3;
        }
    }

    public void close(){
        name = name + "CLOSED";
        System.out.println("Account Closed");
        balance = 0;
        AccDecrement();
    }
}
