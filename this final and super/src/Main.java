class A{
    int x,y,z;
    public int a;
    public void f1(){
        System.out.println("parent class");
    }
    public A(int x){
        a = x;
        System.out.println("first parent class constructor");
    }
}
class B extends A{
    int a=10;
    public void f2(){
        int a=20;
        System.out.println("child class");
        System.out.println( this.a);
        System.out.println( a );
        System.out.println(super.a);

    }
    public B(){
        this(10);
        System.out.println("first child class constructor");
    }
    public B(int z){
        super(z);
        System.out.println("second child class constructor");

//        Calling parent class constructor using super keyword
    }

}
public class Main {
    public static void main(String[] args) {
        B b1 = new B();
        b1.f2();
//        String myString;
//
//        // Attempt to print the uninitialized variable
//        System.out.println(myString);
    }
}