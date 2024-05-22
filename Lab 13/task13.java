import java.util.Scanner;

class sinThread extends Thread {
    int z;
    double s;

    @Override
    public void run() {
        s = Math.sin(Math.toRadians(z));
    }

    sinThread(int a) {
        z = a;
    }
}

class cosThread extends Thread {
    int a;
    double b;

    @Override
    public void run() {
        b = Math.cos(Math.toRadians(a));
    }

    cosThread(int a) {
        this.a = a;
    }
}

class tanThread extends Thread {
    int z;
    double s;

    @Override
    public void run() {
        s = Math.tan(Math.toRadians(z));
    }

    tanThread(int a) {
        z = a;
    }
}

public class task13 {
    public static void main(String args[]) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter For Sin: ");

        sinThread a = new sinThread(input.nextInt());
        System.out.println("Enter for Cos: ");
        cosThread b = new cosThread(input.nextInt());
        System.out.println("Enter for Tan: ");
        tanThread c = new tanThread(input.nextInt());
        System.out.println("Thread A started");
        a.start();
        System.out.println("Thread B started");
        b.start();
        System.out.println("Thread C started");
        c.start();
        a.join();
        b.join();
        c.join();
        double result = a.s + b.b + c.s;
        System.out.println("The Result is: " + result );
        input.close();
    }

}