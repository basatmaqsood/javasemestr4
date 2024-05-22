class A implements Runnable{
    public void run() {
        for (int i = 1; i <= 300; i++) {
            System.out.println("Thread A is running at "+i);
        }
    }
}
class B implements Runnable{
    public void run() {
        for (int i = 1; i <= 200; i++) {
            System.out.println("Thread B is running at "+i);
        }
    }
}

class C extends Thread{
    public void run() {
        for (int i = 1; i <= 150; i++) {
            System.out.println("Thread C is running at "+i);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

//Threads using Runnable interface in java
        Thread T1 = new Thread(new A());
        Thread T2 = new Thread(new B());
        T1.start();
        T2.start();
//Threads using Threads class in Java
        C T3 = new C();

//It is better to use runnable interface in java as Thread class cannot have multiple parents
    }
}